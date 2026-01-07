package com.operators;

public class Operators {
/* OPERATORS - > Operators are symbols used to perform operations on variables and values.
Main Types of Operators

Arithmetic Operators
+ - * / %

Relational Operators
> < >= <= == !=

Logical Operators
&& || !

Assignment Operators
= += -= *= /=
Bitwise Operators 
& → AND (bit by bit)

| → OR (bit by bit)

^ → XOR (same = 0, different = 1)

~ → NOT (bit invert)

<< → Left shift

>> → Right shift
Unary Operators
++ -- INCREMENT / DECRIMENT 
*/
public static void main(String[] args) {
	  int a = 10, b = 5;

      // Arithmetic Operators
      System.out.println(a + b); // 15
      System.out.println(a * b); // 50

      // Relational Operator
      System.out.println(a > b); // true

      // Logical Operator
      System.out.println(a > 5 && b < 10); // true

      // Assignment Operator
      a += 5; // a = a + 5
      System.out.println(a); // 15

      // Unary Operator
      b++; // increment
      System.out.println(b); // 6
      System.out.println(a & b); // Perform operation as bit level 
}
}
