package com.javaarray;

public class PrintTableForLastElement {
   static void table(int[] a , int size) {
	   int lastElement = a[size-1];
	   for(int i=1 ; i<=10 ; i++) {
		   System.out.println(i*lastElement);
	   }
   }
   
   // MAIN METHOD
    public static void main(String[] args) {
		int arr[] = {3,2,5,8,7,9};
		table(arr,arr.length);
	}
}
