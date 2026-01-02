package com.s;
// Public -> Access anyWhere 
public class Service {
    public int s=20;
    public static void main(String[] args) {
		Service sec = new Service();
		Sample s2 = new Sample();
		System.out.println(sec.s);  // s can accessible because of public 
		//System.out.println(s2.s);  // s can not access because it is private in Sample class 
	}
}
