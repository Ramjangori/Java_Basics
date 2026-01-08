package com.conditionalStarements;

public class MultipleIf { // IN MULTIPLE IF ALL CONDITIONS CHECK
	public static void main(String[] args) {
		  int number = 15; // Given number

	        // First if condition
	        if (number > 0) {
	            System.out.println("Number is positive");
	        }

	        // Second if condition
	        if (number % 2 == 0) {
	            System.out.println("Number is even");
	        }

	        // Third if condition
	        if (number % 5 == 0) {
	            System.out.println("Number is divisible by 5");
	        }
	}

}
