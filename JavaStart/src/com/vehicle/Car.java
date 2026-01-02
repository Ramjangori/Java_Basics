package com.vehicle; // create com.vehicle package 
import com.component.*; // import com.component package to use component package classes in this package


public class Car {
     public static void main(String[] args) {
		Engine e = new Engine(); // Create refference of Engine class 
		System.out.println(e.start());  // Calling Method start 
	}
      
}
