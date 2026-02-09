package com.javaarray;
// middle element of odd lenth array
public class MiddleElement {
	static void mid(int[] a , int size) {
		   int midIndex = size/2;
		   System.out.println(a[midIndex]);
	   }
	   
	   // MAIN METHOD
	    public static void main(String[] args) {
			int arr[] = {3,2,5,8,7,9,4,7,8};
			mid(arr,arr.length);
		}
}
