CoreLargePrint — CTP100LG CorePrint raster integration
======================================================

This revision replaces the previous generic ESC/POS text/image path with a
CorePrint-style 51 78 print stream reconstructed from the CTP100LG smali data
provided during the project work.

Implemented:
- Paired Bluetooth device picker and Bluetooth Classic SPP connection.
- CorePrint image header: 51 78 BE 00 01 00 00 00 FF.
- CorePrint text header:  51 78 BE 00 01 00 01 07 FF.
- Feed command with CRC-8; feed(20) = 51 78 BD 00 01 00 14 6C FF (latest recovered CTP100LG command).
- 200 dpi raster path split into 20-row blocks.
- Java zlib/Deflater compression and 51 78 CE frame lengths / CRC / FF trailer.
- Receipt text rendered to a 576-dot bitmap; image picker, preview, remove, print.
- Bounded 512-byte Bluetooth stream writes with 15 ms inter-chunk pacing.

Important accuracy note:
The image/text headers and CRC-8 lookup algorithm are present in BluetoothOrder.java. The CTP100LG Professional_Printer profile specifies 20-row blocks, 15 ms pacing, and a 512-byte transfer size. The BD feed packet is corroborated by the latest recovered CTP100LG packet. The CE raster frame structure and zlib compression method are not established by the four supplied Java files and remain unverified. The original app's complete pixel lookup-table conversion and full print sequencing are also not present in this archive. This implementation uses a conventional
MSB-first monochrome packing pass (Floyd-Steinberg for images; threshold for
text) to populate those recovered frames. Treat it as a protocol-integrated
build candidate, not a physically verified driver, until the CTP100LG prints
both a text receipt and a selected image.

Build on the Android phone in Termux:
1. Extract this project folder to shared storage or Termux home.
2. Ensure Termux has Gradle, Java 17/21, Android SDK platform 35, build-tools 35,
   and the configured aapt2 binary.
3. Run: bash build-termux.sh
4. The script copies the debug APK to:
   ~/storage/downloads/CoreLargePrint-CTP100LG-CorePrint.apk

If the SDK is not detected automatically, create local.properties containing:
   sdk.dir=/data/data/com.termux/files/home/Android/Sdk
Use the actual SDK path on the phone if different.

The build container used to prepare this source archive does not have an Android
SDK or Gradle installation, so it could not produce/sign an installable APK.
No claim of successful physical printing is made.

GITHUB ACTIONS BUILD
--------------------
This project includes .github/workflows/android-apk.yml.
Upload/push the project to a GitHub repository. On push to main/master, or
from the repository's Actions tab using "Build CoreLargePrint APK" > "Run
workflow", GitHub builds app/build/outputs/apk/debug/app-debug.apk.
Download it from the completed workflow run's Artifacts section:
CoreLargePrint-debug-apk. This is an installable Android debug-signed APK.
The workflow uses Java 17, Gradle 8.7, Android platform 35 and build-tools
35.0.0. No Termux SDK path or local.properties SDK path is used in CI.

IMPORTANT PRINT-PROTOCOL LIMITATION
-----------------------------------
The exact CTP100LG CorePrint raster framing/encoding has not been verified
against a successful physical print. A successful GitHub build only proves
the Android project compiles; it does not prove the printer will print.
