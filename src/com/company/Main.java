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


        String rightExtension = extensionChecker.pointExtension(hexString);
        if (allegedFileExtension.contains(rightExtension.toLowerCase())) {
            System.out.println("Extension is true and it is a " + allegedFileExtension + " file");
        } else {
            System.out.println("Extension is " + allegedFileExtension + " while actually it's a " + rightExtension);
        }
    }
}
