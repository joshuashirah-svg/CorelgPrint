package com.corelargeprint;

import android.Manifest;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;

public class MainActivity extends Activity {
    private static final UUID SPP = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
    private static final byte[] PROBE = hex("FE 01 00 09 27 11 00 01 0A");
    private Spinner devices;
    private TextView status;
    private EditText receipt;
    private ImageView preview;
    private Button removeImage, printImage;
    private BluetoothSocket socket;
    private OutputStream output;
    private InputStream input;
    private Bitmap selectedBitmap;
    private final StringBuilder log = new StringBuilder();

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_main);
        devices = findViewById(R.id.deviceSpinner);
        status = findViewById(R.id.status);
        receipt = findViewById(R.id.receiptText);
        preview = findViewById(R.id.imagePreview);
        removeImage = findViewById(R.id.removeImageButton);
        printImage = findViewById(R.id.printImageButton);

        findViewById(R.id.refreshButton).setOnClickListener(v -> refreshPaired());
        findViewById(R.id.connectButton).setOnClickListener(v -> connect());
        findViewById(R.id.printButton).setOnClickListener(v -> printReceipt());
        findViewById(R.id.imageButton).setOnClickListener(v -> chooseImage());
        printImage.setOnClickListener(v -> printSelectedImage());
        removeImage.setOnClickListener(v -> {
            selectedBitmap = null; preview.setImageDrawable(null);
            preview.setVisibility(View.GONE); removeImage.setVisibility(View.GONE); printImage.setVisibility(View.GONE);
            setStatus("Image removed");
        });
        findViewById(R.id.probeButton).setOnClickListener(v -> probe());
        findViewById(R.id.startupButton).setOnClickListener(v -> captureStatus());
        findViewById(R.id.rawButton).setVisibility(View.GONE); // Never send generic ESC/POS to this printer.
        findViewById(R.id.feedButton).setOnClickListener(v -> feedTest());
        requestBluetoothPermission();
        refreshPaired();
        setStatus("Ready. Pair the CTP100LG in Android Bluetooth settings, then connect here.");
    }

    private void requestBluetoothPermission() {
        if (Build.VERSION.SDK_INT >= 31 && checkSelfPermission(Manifest.permission.BLUETOOTH_CONNECT) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.BLUETOOTH_CONNECT, Manifest.permission.BLUETOOTH_SCAN}, 100);
        }
    }

    private void refreshPaired() {
        try {
            BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
            if (adapter == null || !adapter.isEnabled()) { setStatus("Bluetooth unavailable or disabled"); return; }
            ArrayList<BluetoothDevice> found = new ArrayList<>(adapter.getBondedDevices());
            ArrayList<String> labels = new ArrayList<>();
            for (BluetoothDevice d : found) labels.add((d.getName() == null ? "Paired printer" : d.getName()) + " [" + d.getAddress() + "]");
            devices.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, labels));
            devices.setTag(found);
            setStatus("Found " + found.size() + " paired Bluetooth device(s)");
        } catch (Exception e) { setStatus("Bluetooth refresh failed: " + e.getMessage()); }
    }

    @Override public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100) refreshPaired();
    }

    @SuppressWarnings("unchecked") private BluetoothDevice selectedDevice() {
        ArrayList<BluetoothDevice> list = (ArrayList<BluetoothDevice>) devices.getTag();
        if (list == null || list.isEmpty() || devices.getSelectedItemPosition() < 0) return null;
        return list.get(devices.getSelectedItemPosition());
    }

    private void connect() {
        new Thread(() -> {
            try {
                BluetoothDevice device = selectedDevice();
                if (device == null) throw new IOException("Select a paired printer first");
                closeConnection();
                setStatus("Connecting over Bluetooth Classic SPP to " + device.getName());
                BluetoothSocket s = device.createRfcommSocketToServiceRecord(SPP);
                s.connect();
                socket = s; output = s.getOutputStream(); input = s.getInputStream();
                append("CONNECTED SPP " + SPP + " — " + device.getAddress() + "\n");
                setStatus("Connected to " + device.getName() + " using Bluetooth Classic SPP");
            } catch (Exception e) { append("CONNECT ERROR: " + e + "\n"); setStatus(log.toString()); }
        }).start();
    }

    private void printReceipt() {
        if (output == null) { setStatus("Connect to the paired printer first"); return; }
        String content = receipt.getText().toString();
        new Thread(() -> {
            Bitmap textBitmap = null;
            try {
                textBitmap = makeReceiptBitmap(content);
                byte[] job = CorePrintProtocol.buildJob(textBitmap, true, 20);
                transmit(job, "COREPRINT TEXT RECEIPT");
                setStatus("CorePrint text-format job sent: " + job.length + " bytes. Check the printer for paper output.");
            } catch (Exception e) { append("TEXT PRINT ERROR: " + e + "\n"); setStatus(log.toString()); }
            finally { if (textBitmap != null) textBitmap.recycle(); }
        }).start();
    }

    private Bitmap makeReceiptBitmap(String text) {
        int width = CorePrintProtocol.PRINT_WIDTH;
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.BLACK); paint.setTextSize(27f); paint.setTypeface(Typeface.create("monospace", Typeface.NORMAL));
        String[] rawLines = text.replace("\r", "").split("\n", -1);
        ArrayList<String> lines = new ArrayList<>();
        float max = width - 28;
        for (String line : rawLines) {
            if (line.isEmpty()) { lines.add(" "); continue; }
            StringBuilder current = new StringBuilder();
            for (int i=0;i<line.length();i++) {
                char ch=line.charAt(i);
                if (current.length()>0 && paint.measureText(current.toString()+ch)>max) { lines.add(current.toString()); current.setLength(0); }
                current.append(ch);
            }
            lines.add(current.toString());
        }
        int lineHeight = 36, height = Math.max(80, 24 + lines.size()*lineHeight + 20);
        Bitmap b = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas c = new Canvas(b); c.drawColor(Color.WHITE);
        float y=28+paint.getTextSize();
        for(String line:lines){c.drawText(line,14,y,paint);y+=lineHeight;}
        return b;
    }

    private void chooseImage() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT);
        intent.setType("image/*"); intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent, 200);
    }

    @Override protected void onActivityResult(int request, int result, Intent data) {
        super.onActivityResult(request, result, data);
        if (request == 200 && result == RESULT_OK && data != null && data.getData() != null) {
            try {
                Uri uri = data.getData();
                getContentResolver().takePersistableUriPermission(uri, Intent.FLAG_GRANT_READ_URI_PERMISSION);
                Bitmap b;
                try (InputStream stream = getContentResolver().openInputStream(uri)) { b = android.graphics.BitmapFactory.decodeStream(stream); }
                if (b == null) throw new IOException("Could not decode image");
                if (selectedBitmap != null) selectedBitmap.recycle();
                selectedBitmap = b; preview.setImageBitmap(b); preview.setVisibility(View.VISIBLE);
                removeImage.setVisibility(View.VISIBLE); printImage.setVisibility(View.VISIBLE);
                setStatus("Image ready: " + b.getWidth() + " × " + b.getHeight());
            } catch (Exception e) { setStatus("Image selection failed: " + e.getMessage()); }
        }
    }

    private void printSelectedImage() {
        if (output == null) { setStatus("Connect to the paired printer first"); return; }
        if (selectedBitmap == null) { setStatus("Choose an image first"); return; }
        Bitmap source = selectedBitmap;
        new Thread(() -> {
            try {
                byte[] job = CorePrintProtocol.buildJob(source, false, 20);
                transmit(job, "COREPRINT IMAGE");
                setStatus("CorePrint image job sent: " + job.length + " bytes. Check the printer for paper output.");
            } catch (Exception e) { append("IMAGE PRINT ERROR: " + e + "\n"); setStatus(log.toString()); }
        }).start();
    }

    private void feedTest() {
        if (output == null) { setStatus("Connect first"); return; }
        new Thread(() -> {
            try { transmit(CorePrintProtocol.feedPaper(20), "CTP100LG FEED 20"); setStatus("Feed command sent. Check whether the printer advances paper."); }
            catch (Exception e) { append("FEED ERROR: " + e + "\n"); setStatus(log.toString()); }
        }).start();
    }

    private void probe() {
        if (output == null) { setStatus("Connect first"); return; }
        new Thread(() -> {
            try { transmit(PROBE, "KNOWN CONTROL PROBE"); Thread.sleep(300); readAvailable(900); setStatus(log.toString()); }
            catch (Exception e) { append("PROBE ERROR: " + e + "\n"); setStatus(log.toString()); }
        }).start();
    }

    private void captureStatus() {
        if (input == null) { setStatus("Connect first"); return; }
        new Thread(() -> { try { readAvailable(1800); setStatus(log.toString()); }
            catch (Exception e) { append("READ ERROR: " + e + "\n"); setStatus(log.toString()); } }).start();
    }

    private void transmit(byte[] data, String label) throws Exception {
        OutputStream stream = output;
        if (stream == null) throw new IOException("Bluetooth connection is closed");
        append("TX " + label + " [" + data.length + " bytes]\n");
        // Keep writes bounded for the printer's small receive buffer while preserving stream order.
        for (int offset=0; offset<data.length; offset+=512) {
            int count=Math.min(512,data.length-offset);
            stream.write(data,offset,count); stream.flush();
            if (offset+count<data.length) Thread.sleep(15);
        }
        append("TX COMPLETE " + label + "\n");
    }

    private void readAvailable(long durationMs) throws Exception {
        InputStream stream=input;
        if(stream==null)return;
        long end=System.currentTimeMillis()+durationMs;
        ByteArrayOutputStream bytes=new ByteArrayOutputStream();
        while(System.currentTimeMillis()<end){while(stream.available()>0)bytes.write(stream.read());Thread.sleep(25);}
        byte[] data=bytes.toByteArray();
        append(data.length==0?"RX: NO RESPONSE\n":"RX ["+data.length+"] " + CorePrintProtocol.toHex(data)+"\n");
    }

    private void append(String s) { synchronized(log) { log.append(s); if(log.length()>12000)log.delete(0,log.length()-12000); } }
    private void setStatus(String s) { runOnUiThread(() -> status.setText("Status: " + s)); }
    private void closeConnection() { try { if(socket!=null)socket.close(); } catch(Exception ignored){} socket=null; output=null; input=null; }
    @Override protected void onDestroy() { closeConnection(); if(selectedBitmap!=null)selectedBitmap.recycle(); super.onDestroy(); }

    private static byte[] hex(String value) { String[] p=value.split("\\s+");byte[] b=new byte[p.length];for(int i=0;i<p.length;i++)b[i]=(byte)Integer.parseInt(p[i],16);return b; }
}
