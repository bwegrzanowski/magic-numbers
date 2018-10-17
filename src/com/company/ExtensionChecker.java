package com.company;

import java.io.*;
import java.nio.file.Files;

public class ExtensionChecker {

    //converts file to byte array
    public byte[] fileToByteArray(String path) throws IOException {
        byte[] array = Files.readAllBytes(new File(path).toPath());
        return array;
    }

    //converts byte array to its hexadecimal equivalent
    public String toHexString(byte[] bytes) {
        char[] hexArray = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] hexChars = new char[bytes.length * 2];
        int v;
        for ( int i = 0; i < bytes.length; i++ ) {
            v = bytes[i] & 0xFF;
            hexChars[i*2] = hexArray[v/16];
            hexChars[i*2 + 1] = hexArray[v%16];
        }
        return new String(hexChars);
    }
    //reads file extension from file name
    public String getAllegedFileExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return "";
        }
        return name.substring(lastIndexOf);
    }
}
