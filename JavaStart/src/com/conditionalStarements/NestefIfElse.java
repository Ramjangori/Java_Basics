package com.conditionalStarements;
import java.util.*;

public class NestefIfElse {
// USE TO CHECK MULTIPLE CONDITIONS , Use if inside if or is-else inside if and else 
public static void main(String[] args) {
	// EXAMPLE TO CHECK GRETEST NUMBER IN THREE NUMBER 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Three Numbers :");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(a>b) {
		if(a>c) {
			System.out.println(a+" is Greatest");
		}
		else {
			System.out.println(c+ " is greatest ");
		}
		
	}
	else {
		if(b>c) {
			System.out.println(b+ "Is greatest");
		}
		else {
			System.out.println(c+ " Is greatest");
		}
	}
}

}
