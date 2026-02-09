package com.javaarray;
// Swapping first and second element inn the array 
public class Swap {
 public static void main(String[] args) {
	  int arr[] = {5,6,7,3,4,8,9,5,6};
//	  int temp = arr[0];
//	  arr[0] = arr[1];
//	  arr[1] = temp;
//	  for(int a : arr) {
//		  System.out.println(a);
//	  }
	  
	  // Swap at specified location  at index = 3
	  int temp = arr[0];
	  arr[0]= arr[3];
	  arr[3] = temp;
	  for(int a : arr) {
		  System.out.println(a);
  }
	  
	 
}
}
