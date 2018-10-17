package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ExtensionChecker extensionChecker = new ExtensionChecker();

        //file path
        String path = "";

        System.out.println("the file states that it is a " + extensionChecker.getAllegedFileExtension(new File(path)) + " but it is a " + "" + " actually");

        byte[] bytes = extensionChecker.fileToByteArray(path);
        System.out.println(extensionChecker.toHexString(bytes));
    }
}
