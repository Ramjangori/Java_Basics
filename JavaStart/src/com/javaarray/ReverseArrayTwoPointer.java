package com.javaarray;

import java.util.Arrays;

public class ReverseArrayTwoPointer {
    public static void main(String[] args) {
		int[] arr = {5,4,6,7,2,3,9};
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			int temp;
			temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
