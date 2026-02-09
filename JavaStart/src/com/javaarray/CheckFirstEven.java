package com.javaarray;

public class CheckFirstEven {
	private static void CheckFirstEven(int arr[] , int size) {
		for(int i=0 ; i<size ; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
				break;
				
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = {5,7,6,3};
		int size = arr.length;
		CheckFirstEven(arr , size);
		
		
	
}}
