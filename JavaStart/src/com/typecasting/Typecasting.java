package com.typecasting;

public class Typecasting {
	 public static void main(String[] args) {

	        /*
	         1. Widening Type Casting (Implicit)
	         ----------------------------------
	         - Converting smaller data type into larger data type
	         - Done automatically by Java
	         - No data loss
	         
	         Order:
	         byte -> short -> int -> long -> float -> double
	        */

	        int a = 10;
	        double d = a;   // int is automatically converted to double

	        System.out.println("Int value : " + a);
	        System.out.println("Double value (after widening) : " + d);

	        /*
	         2. Narrowing Type Casting (Explicit)
	         -----------------------------------
	         - Converting larger data type into smaller data type
	         - Done manually by programmer
	         - Data loss may occur
	        */

	        double x = 10.75;
	        int y = (int) x;   // explicit casting from double to int

	        System.out.println("Double value : " + x);
	        System.out.println("Int value (after narrowing) : " + y);

	        /*
	         Example of data loss
	         --------------------
	         Decimal part is lost during narrowing casting
	        */

	        byte b;
	        int num = 130;

	        // byte range is -128 to 127, so overflow occurs
	        b = (byte) num;

	        System.out.println("Int value : " + num);
	        System.out.println("Byte value (after narrowing with overflow) : " + b);
	    }
}
