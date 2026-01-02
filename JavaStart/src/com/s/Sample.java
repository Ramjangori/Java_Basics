package com.s;
  /* ACCESS MODIFIERS -> It defines the Accessibility and Visibility of a variables , classes , methods etc.
   Types of Access Modifiers - >   1. public 
                                -> 2. private
                                -> protected
                                -> default 
 Access Modifiers used before variables , classes , methods etc.*/
public class Sample {
	private int s = 10;   /*-> Here int is a private-> access only with in this class */
	public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println(s1.s);
	};
	                                        
	                      

}
