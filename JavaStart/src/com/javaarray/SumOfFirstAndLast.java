package com.javaarray;

public class SumOfFirstAndLast {
  public static void main(String[] args) {
	int[] arr = {4,5,6,7,2,3,8,9,4};
	int size = arr.length;
	int first = arr[0];
	int last = arr[size-1];
	int SumOfFirstAndLast = first+last;
	System.out.println(SumOfFirstAndLast);
	
}
}
