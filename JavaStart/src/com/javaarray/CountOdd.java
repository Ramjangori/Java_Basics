package com.javaarray;



public class CountOdd {

		static int OddCount(int arr[] , int size) {
		
			int count=0;
			for(int i=0 ; i<size ; i++) {
				if(arr[i]%2!=0) {
					count++;
				}
			}
			return  count;
		}
			
	  public static void main(String[] args) {
		  int arr[] = {6,4,5,7,8};
		  int size = arr.length;
		 System.out.println("Total Odd Number Is :" + OddCount(arr,size) );
	}
}
