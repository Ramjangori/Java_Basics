package com.javaarray;

public class SwapSmallestLargest {
  public static void main(String[] args) {
	int arr[] = {2,3,4,1,5,6,7,8};
	int sm = Integer.MAX_VALUE;
	int smindex=0;
	int mx=Integer.MIN_VALUE;
	int mxindex=0;
	for(int i=0 ; i<arr.length;i++) {
		if(arr[i]<sm) {
			sm = arr[i];
			smindex = i;
		}
		if(arr[i]>mx) {
			mx = arr[i];
			mxindex = i;
		}
	}
	
//	System.out.println("Smallest value :" +sm);
//	System.out.println("smallest index : " +smindex);
//	System.out.println("largest value :" +mx);
//	System.out.println("largest index : " +mxindex);
	
	// Swapping largest and smallest 
	int temp = arr[smindex];
	arr[smindex] = arr[mxindex];
	arr[mxindex] = temp;
	// printing ELement after Swapping 
	for(int n : arr) {
		System.out.println(n);
	}
}
}
