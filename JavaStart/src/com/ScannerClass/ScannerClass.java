 package com.ScannerClass;

import java.util.Scanner; 
// Scanner class is present in java.util package
// It is used to take input from the user at runtime

public class ScannerClass {

    public static void main(String[] args) {

        // Creating Scanner object
        // System.in means input will be taken from keyboard
        Scanner sc = new Scanner(System.in);

        // Taking integer input from user
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); 
        // nextInt() reads integer value

        // Taking String input from user
        System.out.print("Enter your name: ");
        String name = sc.next(); 
        // next() reads a single word string

        // Printing user input
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Closing Scanner object
        // It is good practice to close Scanner to free resources
        sc.close();
    }
}
