package com.variables.datatypes;

// Variable -> a named memory location used to store data
// Same variable name cannot be redeclared in the same scope
// Example: int a = 10;

public class VariablesAndDatatypes {

    public static void main(String[] args) {

        int a = 10;  // a -> variable name, 10 -> value
        System.out.println(a);

        /*
         Data Types -> define the type of data that a variable can store,
         including its size and range.

         Types of Data Types:
         1. Primitive
         2. Non-Primitive / UserDefined Datatypes

         Primitive Data Types:
         byte    -> 1 byte
         short   -> 2 bytes
         int     -> 4 bytes
         long    -> 8 bytes
         float   -> 4 bytes
         double  -> 8 bytes
         boolean -> 1 bit
         char    -> 2 bytes
         
         UserDefined dataTypes:
         class
         enum
         interface
         etc.
         
        */

        byte b = 10;
        System.out.println(b);
    }
}
