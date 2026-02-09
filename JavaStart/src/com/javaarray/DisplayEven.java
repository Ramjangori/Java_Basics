package com.javaarray;

public class DisplayEven {

		static void Even(int arr[] , int size) {
			int sum = 0;
			for(int i=0 ; i<size ; i++) {
				if(arr[i]%2==0) {
					System.out.println(arr[i]);
				}
			}
		}
			
	  public static void main(String[] args) {
		  int arr[] = {6,4,5,7,8};
		  int size = arr.length;
		 Even(arr,size);
	}
}
