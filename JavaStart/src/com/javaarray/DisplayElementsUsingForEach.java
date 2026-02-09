package com.javaarray;

public class DisplayElementsUsingForEach {
  public static void main(String[] args) {
	  int arr[] = {5,6,7,3,4,8,9,5,6};
	   for(int a:arr){
		  System.out.println(a);
	   }
	   
	   // Sum of element using for each loop
//	   int sum = 0;
//	   for(int a : arr) {
//		   sum+=a;
//	   }
//	   
//	   System.out.println("Sum of element is : " + sum);
	   
	   // Sum of odd Number using for each loop
	   int sum = 0;
	   for(int a : arr) {
		   if(a%2!=0) {
			   sum+=a;
		   }
	   }
	   System.out.println("Sum of odd Number is " + sum);
	}
}
