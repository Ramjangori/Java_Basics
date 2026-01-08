package com.conditionalStarements;

public class IfElseLadder {
 public static void main(String[] args) {
	 int marks = 72; // Student marks
	 
	 // If -else ladder use to check another condition when first condition is false and if no one condition is true else part is execute

     // if-else ladder to check grade
     if (marks >= 90) {
         System.out.println("Grade: A");
     }
     else if (marks >= 75) {
         System.out.println("Grade: B");
     }
     else if (marks >= 60) {
         System.out.println("Grade: C");
     }
     else if (marks >= 40) {
         System.out.println("Grade: D");
     }
     else {
         System.out.println("Grade: Fail");
     }
}
}
