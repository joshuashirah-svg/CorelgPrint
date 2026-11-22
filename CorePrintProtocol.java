package com.corelargeprint;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/** CTP100LG / CorePrint raster command encoder reconstructed from CorePrint smali. */
public final class CorePrintProtocol {
    private CorePrintProtocol() {}
    public static final int PRINT_WIDTH = 576;
    public static final int BLOCK_ROWS = 20; // CTP100LG Professional_Printer profile: 200 dpi, 20-row block setting.
    public static final byte[] IMAGE_HEADER = hex("51 78 BE 00 01 00 00 00 FF");
    public static final byte[] TEXT_HEADER  = hex("51 78 BE 00 01 00 01 07 FF");

    public static byte[] feedPaper(int amount) {
        int n = Math.max(0, Math.min(255, amount));
        byte[] p = hex("51 78 BD 00 01 00 00 00 FF");
        p[6] = (byte)n;
        p[7] = (byte)crc8(new byte[]{p[6]});
        return p;
    }

    /** Build the CorePrint command header, feed command, then 18-row zlib raster frames. */
    public static byte[] buildJob(Bitmap source, boolean textMode, int feed) throws IOException {
        if (source == null) throw new IllegalArgumentException("No image selected");
        Bitmap scaled = scaleToWidth(source, PRINT_WIDTH);
        byte[] jobHeader = textMode ? TEXT_HEADER : IMAGE_HEADER;
        ByteArrayOutputStream job = new ByteArrayOutputStream();
        job.write(jobHeader);
        job.write(feedPaper(feed));
        int rowBytes = PRINT_WIDTH / 8;
        byte[] packed = packAllRows(scaled, rowBytes, !textMode);
        for (int top = 0; top < scaled.getHeight(); top += BLOCK_ROWS) {
            int rows = Math.min(BLOCK_ROWS, scaled.getHeight() - top);
            byte[] raster = new byte[rowBytes * rows];
            System.arraycopy(packed, top * rowBytes, raster, 0, raster.length);
            job.write(frame(raster));
        }
        if (scaled != source) scaled.recycle();
        return job.toByteArray();
    }

    private static Bitmap scaleToWidth(Bitmap src, int width) {
        int h = Math.max(1, Math.round(src.getHeight() * (width / (float)src.getWidth())));
        return src.getWidth() == width ? src : Bitmap.createScaledBitmap(src, width, h, true);
    }

    /**
     * CTP100LG is not the A4XII profile. The recovered path walks source pixels
     * right-to-left within each byte. Image mode uses Floyd-Steinberg grayscale
     * conversion; text mode uses a direct threshold as in the CorePrint text path.
     */
    private static byte[] packAllRows(Bitmap bmp, int rowBytes, boolean dither) {
        int width = bmp.getWidth(), height = bmp.getHeight();
        byte[] out = new byte[rowBytes * height];
        float[] current = new float[width + 2];
        float[] next = new float[width + 2];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int c = bmp.getPixel(x, y);
                float lum = (Color.red(c) * 299 + Color.green(c) * 587 + Color.blue(c) * 114) / 1000f;
                float adjusted = Math.max(0f, Math.min(255f, lum + (dither ? current[x + 1] : 0f)));
                boolean black = adjusted < 128f;
                float error = adjusted - (black ? 0f : 255f);
                if (dither) {
                    current[x + 2] += error * (7f / 16f);
                    next[x] += error * (3f / 16f);
                    next[x + 1] += error * (5f / 16f);
                    next[x + 2] += error * (1f / 16f);
                }
                if (black) {
                    int byteIndex = y * rowBytes + (x / 8);
                    out[byteIndex] |= (byte)(0x80 >>> (x & 7));
                }
            }
            if (dither) { float[] swap = current; current = next; next = swap; java.util.Arrays.fill(next, 0f); }
        }
        return out;
    }

    /** 51 78 CE frame: lengths are big-endian; CRC covers header and compressed payload. */
    public static byte[] frame(byte[] raster) throws IOException {
        ByteArrayOutputStream compressedOut = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(Deflater.DEFAULT_COMPRESSION, false);
        try (DeflaterOutputStream dos = new DeflaterOutputStream(compressedOut, deflater, 1024)) {
            dos.write(raster);
            dos.finish();
        } finally { deflater.end(); }
        byte[] compressed = compressedOut.toByteArray();
        if (compressed.length > 65531 || raster.length > 65535)
            throw new IOException("Raster block exceeds CorePrint frame length");
        byte[] frame = new byte[compressed.length + 12];
        frame[0] = 0x51; frame[1] = 0x78; frame[2] = (byte)0xCE; frame[3] = 0;
        put16(frame, 4, compressed.length + 4);
        put16(frame, 6, raster.length);
        put16(frame, 8, compressed.length);
        System.arraycopy(compressed, 0, frame, 10, compressed.length);
        frame[frame.length - 2] = (byte)crc8(frame, 0, frame.length - 2);
        frame[frame.length - 1] = (byte)0xFF;
        return frame;
    }

    private static void put16(byte[] a, int p, int v) { a[p]=(byte)(v>>>8); a[p+1]=(byte)v; }
    public static int crc8(byte[] a, int off, int len) {
        int crc=0;
        for (int i=off;i<off+len;i++) {
            crc ^= a[i] & 255;
            for (int b=0;b<8;b++) crc = (crc & 0x80)!=0 ? ((crc<<1)^0x07)&255 : (crc<<1)&255;
        }
        return crc;
    }
    public static int crc8(byte[] a) { return crc8(a,0,a.length); }
    private static byte[] hex(String s) {
        String[] p=s.split("\\s+"); byte[] b=new byte[p.length];
        for(int i=0;i<p.length;i++) b[i]=(byte)Integer.parseInt(p[i],16);
        return b;
    }
    public static String toHex(byte[] a) {
        StringBuilder s=new StringBuilder();
        for(byte b:a){if(s.length()>0)s.append(' ');s.append(String.format(java.util.Locale.US,"%02X",b&255));}
        return s.toString();
    }
    public static boolean selfTest() {
        return toHex(feedPaper(20)).equals("51 78 BD 00 01 00 14 6C FF")
            && toHex(IMAGE_HEADER).equals("51 78 BE 00 01 00 00 00 FF")
            && toHex(TEXT_HEADER).equals("51 78 BE 00 01 00 01 07 FF");
    }
}
