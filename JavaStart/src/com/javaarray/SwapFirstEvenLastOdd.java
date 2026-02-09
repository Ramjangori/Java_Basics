package com.javaarray;



public class SwapFirstEvenLastOdd {
 static int firstEvenIndex(int arr[] , int size) {
	 int ind =-1;
	 for(int i=0;i<size ; i++ ) {
		 
		 if(arr[i]%2==0) {
			 ind = i;
			 break;
		 }
		 
	 }
	return ind;
 }
 
 static int lastOddIndex(int arr[] ,int size) {
	 int ind=-1;
	 for(int i=size-1;i>=0 ; i-- ) {
		 
		 if(arr[i]%2!=0) {
			 ind = i;
			 break;
		 }
		 
	 }
	return ind;
 }
  
 // MAIN METHOD
 public static void main(String[] args) {
	int arr[] = {4,5,6,7,8,9,10};
	int evenIndex = firstEvenIndex(arr,arr.length);
	int oddIndex = lastOddIndex(arr,arr.length);
	 if (evenIndex != -1 && oddIndex != -1) {
         int temp = arr[evenIndex];
         arr[evenIndex] = arr[oddIndex];
         arr[oddIndex] = temp;

         for (int a : arr) {
             System.out.println(a);
         }
     } else {
         System.out.println("Swap not possible (even or odd missing)");
     }
	
}
 
}
