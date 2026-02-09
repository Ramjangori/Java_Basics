package com.javaarray;

public class ArrayExample {
	// method to find max 
private static int max(int[] arr , int n) {
	  
	  int max = 0;
	  for(int i=0 ; i<n ; i++) {
		  if(max<arr[i]) {
			  max = arr[i];
		  }
	  }
	  return max;
			  
}

public static void main(String[] args) {
	 int arr[] = {5,4,7,8,3,9,23};
	 int n = arr.length;
	 System.out.println(max(arr,n));
}
}
