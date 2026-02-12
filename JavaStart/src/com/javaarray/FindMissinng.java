package com.javaarray;
// Finding missing number in a array 

public class FindMissinng {
    static public int missing(int arr[] , int size) {
    	int sum = 0;
    	for(int i =0 ; i<size ; i++) {
    		sum+=arr[i];
    	}
    	int total = (size+1)*((size+1)+1)/2;
    	int miss = total-sum;
    	return miss;
    
    }
    
    public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,7,8,9};
	    System.out.println( missing(arr , arr.length));
	}
}
