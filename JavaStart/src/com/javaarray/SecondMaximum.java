package com.javaarray;
// finding second maximum in the array 
public class SecondMaximum {
    private static int sMax(int arr[] , int size) {
    	int max = Integer.MIN_VALUE;
    	int smax = Integer.MIN_VALUE;
    	for(int i=0 ; i<size ; i++) {
    		if(arr[i]>max) {
    			smax=max;
    			max=arr[i];
   		    }
    	}
    		
    	return smax;
    }
    
    public static void main(String[] args) {
		int arr[] = {4,5,6,7,3,5,6,4,2,1,8};
		int n = arr.length;
		System.out.println(sMax(arr,n));
	}
}
