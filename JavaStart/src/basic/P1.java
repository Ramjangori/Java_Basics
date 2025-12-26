package basic;

public class P1 {
     int a = 10; // Instance Variable 
     static int c = 30; // static and instance Variable 
     public static void main(String[] arg) {
    	 int b = 20 ; // local Variable 
    	 P1 p = new P1(); // -> making Object to access non static variable in static context 
    	 /* 
    	  
    	  Here P1 -> class Name 
    	       P -> refference variable which stores address of P1 class object
    	       new -> keyword 
    	       P1()- > Object of class P1
    	       
    	   
    	   
    	*/
    	 
    	 System.out.println(b);
    	 System.out.println(p.a);
     }
}
