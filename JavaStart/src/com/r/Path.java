package com.r;
// protected-> 1-> Access in same class
//             2-> access in sub class and non sub class in same package 
//             3-> access in sub class in another package 
public class Path {
protected String name="Ramjan";
public static void main(String[] args) {
	Path p = new Path();
	System.out.println(p.name); // can access in same class 
}

}

