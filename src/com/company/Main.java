package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ExtensionChecker extensionChecker = new ExtensionChecker();

        //file path
        String path = "";
        String allegedFileExtension = extensionChecker.getAllegedFileExtension(new File(path));
        byte[] bytes = extensionChecker.fileToByteArray(path);
        String hexString = extensionChecker.toHexString(bytes);
        System.out.println("Extension is " + allegedFileExtension + " while actually it's a " +extensionChecker.pointExtension(hexString));
    }
}
