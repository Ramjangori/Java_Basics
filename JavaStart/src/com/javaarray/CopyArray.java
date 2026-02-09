package com.javaarray;
// Copy array in Reverse order
public class CopyArray {
   public static void main(String[] args) {
	int arr[] = {4,5,6,7,8};
	int arr2[] = new int[5];
	int lastIndex = arr.length-1;
	
	for(int i=0 ; i<arr.length ; i++) {
		arr2[i] = arr[lastIndex];
		lastIndex--;
	}
	
	for(int n : arr2) {
		System.out.println(n);
	}
}
}
