package com.javaarray;

public class CopyEven {
	 public static void main(String[] args) {
			int arr[] = {4,5,6,7,8};
			int Even[] = new int[5];
			
			
			for(int i=0 ; i<arr.length ; i++) {
				int j=0;
				if(arr[i]%2==0) {
					Even[j] = arr[i];
					j++;
				}
			}
			
			for(int n : Even) {
				System.out.println(n);
			}
		}
}
