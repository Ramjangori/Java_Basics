package com.conditionalStarements;
import java.util.*; // Scanner Class Present in java.util package 
// Switch Statement alternative of if-else ladder 
// 	EXECUTE BASED ON MATCHING CASE 
public class SwitchExample {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // Scanner class obj
	System.out.println("Enter Two Numbers :"); // INPUT-> TWO NUMBERS 
	int a = sc.nextInt();  // Input 1->a
	int b = sc.nextInt();  // Input 2 ->b
	System.out.println("Enter Operator [+ , - , * , / ]"); // Input Operator 
	char c = sc.next().charAt(0); // Storing input operator in variable c
	switch(c) {  // SWITCHING c based on matching case 
	case '+':
		   int add = a+b;
		   System.out.println("Addition is " + add);
		    break;
		    
	case '-':
		   int sub = a-b;
		   System.out.println("Subtraction  is " + sub);
		    break;
	case '*':
		   int mul = a*b;
		   System.out.println("Multiplication is " + mul);
		    break;
	case '/':
		   int div = a/b;
		   System.out.println("Division  is " + div);
		    break;
    default : 
    	   System.out.println("Enter valid Operator");
	}
}
}
