package com.javaarray;

public class ArrayExample {

    // This method finds the maximum element in the array
    private static int max(int[] arr, int n) {

        // Variable to store the maximum value
        int max = arr[0];

        // Loop through the array elements
        for (int i = 1; i < n; i++) {

            // If current element is greater than max,
            // update the max value
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return the maximum element of the array
        return max;
    }

    public static void main(String[] args) {

        // Array declaration and initialization
        int arr[] = {5, 4, 7, 8, 3, 9, 23};

        // Store array length in variable n
        int n = arr.length;

        // Call max method and print the result
        System.out.println(max(arr, n));
    }
}
