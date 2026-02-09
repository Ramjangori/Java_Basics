package com.javaarray;
// Sum of all Element 
public class SumOfElement {
	static int sum(int arr[] , int size) {
		int sum = 0;
		for(int i=0 ; i<size ; i++) {
			sum+=arr[i];
			
		}
		return sum;
	}
	
	
	
	
	
	
  public static void main(String[] args) {
	  int arr[] = {6,4};
	  int size = arr.length;
	 System.out.println( "Sum of array element is " + sum(arr,size)); 
}
  
}
