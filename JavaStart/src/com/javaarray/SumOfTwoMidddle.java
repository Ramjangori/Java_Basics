package com.javaarray;

public class SumOfTwoMidddle {
	static void mid(int[] a , int size) {
		   int midFirst = size/2; //10/5 = 5
		   int midSecond = size/2-1; // 10/5+2 = 4
		   System.out.println(a[midFirst]+a[midSecond]);
		   System.out.println(midFirst+ "" +midSecond);
	   }
	   
	   // MAIN METHOD
	    public static void main(String[] args) {
			int arr[] = {3,2,5,8,7,9,4,7,8,10};
			mid(arr,arr.length);
		}
}
