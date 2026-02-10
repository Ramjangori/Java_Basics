package com.javaarray;
// findiing Unique Value


public class Unique {
	
	static void unique(int arr[], int size) {
		for(int i=0 ; i<size; i++) {
			int freq=0;
			
			for(int j=0; j<size ; j++) {
				
				 
				if(arr[i]==arr[j]) {
					freq++;
				}
			}
			if(freq==1) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,2,3,3,5,6,6,7,5};
		unique(arr,arr.length);
	}

}
