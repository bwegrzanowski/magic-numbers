package com.company;

public enum HexExtensionEnum {
    pubJPG("FFD8FFE0"),
    GIF("47494638"),
    //no magic number for txt file, first 2 signs represent hexadecimal interpretation (ASCII) of the first letter in file
    //TXT(""),
    RGB("01DA"),
    PNG("89504E47"),
    PDF("25504446"),
    ZIP("504B0304");

    HexExtensionEnum(String a) {
    }

    HexExtensionEnum() {
    }
}
