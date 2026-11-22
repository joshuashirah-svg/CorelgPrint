package com.lib.Utils;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class PrintEncoder {
    public static int hexToInt(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return 0;
        }
        return c - '7';
    }

    public static String encode(String str, String str2) {
        for (int i = 1; i <= 10; i++) {
            if (i > 1) {
                str2 = shiftRight(str2);
            }
            str2 = encodeWithKey(str, str2);
            System.out.println("result" + i + " = " + str2.toUpperCase());
        }
        return str2;
    }

    public static byte[] getRC() {
        Random random = new Random();
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = generateNonZeroHexByte(random);
        }
        return bArr;
    }

    private static byte generateNonZeroHexByte(Random random) {
        byte bNextInt;
        do {
            bNextInt = (byte) (random.nextInt(256) & 255);
        } while (containsZeroInHex(bNextInt));
        return bNextInt;
    }

    private static boolean containsZeroInHex(byte b) {
        return String.format("%02X", Byte.valueOf(b)).contains("0");
    }

    public static String shiftRight(String str) {
        return str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
    }

    public static String encodeWithKey(String str, String str2) {
        int i;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iHexToInt = hexToInt(str.charAt(i2)) * hexToInt(str2.charAt(i2));
            if (iHexToInt != 0) {
                do {
                    i = iHexToInt % 16;
                    if (i == 0) {
                        iHexToInt /= 16;
                    }
                } while (i == 0);
                iHexToInt = i;
            }
            sb.append(Integer.toHexString(iHexToInt).toUpperCase());
        }
        return sb.toString();
    }
}
