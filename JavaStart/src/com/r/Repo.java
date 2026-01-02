package com.r;
import com.s.*;
// Default -> 1. Access in the class
//            2. Access out side class with in same package 
//              3.  Access with in Package 
//              4. Outside package not allow
//  TO CREATE WITH DEFAULT ACCESS MODIFIER WE CAN CREATE WITHOUT KEYWORD IF WO DO NOT WRITE ANYTHING BEFORE CLASS,VARIABLE,METHODS,ETC
// IT WILL INCLUDE IN DEFAULT ACCESS MODIFIER
public class Repo {
   String name = "Ramjan"; //String is default 
   public static void main(String[] args) {
	   Service s1 = new Service();  // here we can access s public variable of Service class which present in another package 
	   Repo r = new Repo();  // here name can access which is default 
	   Path p2 = new Path();
	   System.out.println(s1.s);
	   System.out.println(r.name);
	   System.out.println(p2.name); // can access in outside class and in same package 
	
}
}
