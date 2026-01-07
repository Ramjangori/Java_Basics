package com.variables.datatypes;

public class FinalKeyword {
	// final keyword use to restrict class , method , variable etc. to modify them 
	public static void main(String[] args) {
		final int a = 10;
		//a = 20; // not possible because a is final modification not possible 
		        // same we can use with methods , class etc.
		System.out.println(a); // Give error 
		          
	}

}
