package com.javaarray;
// Second smallest 
public class SecondSmallest {
   static int  smallest2(int arr[] , int size) {
	   int small = Integer.MAX_VALUE;
	   int small2 = Integer.MAX_VALUE;
	   for(int i=0 ;i<size; i++) {
		   if(small>arr[i]) {
			   small2=small;
			   small=arr[i];
		   }
		   else if(arr[i]>small && arr[i]<small2) {
			   small2 = arr[i];
		   }
	   }
	   return small2;
   }
   
   //main method
   public static void main(String[] args) {
	int arr[] = {3,5,6,7,4,88,97,4};
	System.out.println(smallest2(arr,arr.length));
	
}
}
