package com.javaarray;

public class SmallestNumber {
	 private static int min(int arr[] , int size) {
	    	int min = Integer.MAX_VALUE;
	    	
	    	for(int i=0 ; i<size ; i++) {
	    		if(arr[i]<min) {
	    			min=arr[i];
	   		    }
	    	}
	    		
	    	return min;
	    }
	 
	 public static void main(String[] args) {
		 int arr[] = {4,5,6,7,3,5,6,4,2,8};
			int n = arr.length;
			System.out.println(min(arr,n));
		}
	}

