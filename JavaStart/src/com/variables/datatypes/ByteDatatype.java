package com.variables.datatypes;

// byte data type takes 1 byte (8 bits) of memory for each variable
// range -> -128 to 127

public class ByteDatatype {

    public static void main(String[] args) {

        byte a = 10; // byte variable declaration and assignment with value 10

        // byte b = 200;  // invalid because 200 is out of byte range

        System.out.println(a);

        System.out.println("Size Of Byte :: " + Byte.SIZE); 
        // Byte.SIZE returns size in bits (8 bits)

        System.out.println("Min Value Of Byte :: " + Byte.MIN_VALUE); 
        // -128

        System.out.println("Max Value Of Byte :: " + Byte.MAX_VALUE); 
        // 127
    }
}
