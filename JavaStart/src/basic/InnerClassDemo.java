package basic;
class A{
	int a = 10;
	static int b = 20;
	class B{
		void show() {
			System.out.println("show() method in class B..");
			System.out.println("a :" + a);
			System.out.println("b :" + b);
		}
	}
	private class C{
		void display() {
			System.out.println("Display() method in class C..");
			System.out.println("a :" + a);
			System.out.println("b :" + b);
		}
	}
	
	void accessContentOfclassAB() {
		B b = new B();
		b.show();
		C c = new C();
		c.display();
	}
}

public class InnerClassDemo {
   public static void main(String[] args) {
	
	   // Object of class A
	   A a = new A();
	   a.accessContentOfclassAB();
	   
	   // acess class B 
	   A.B ab = new A().new B();
	   ab.show();
	   
	   // access class C 
//	   A.C ac = new A().new C(); -> Can not access C because it is private in A 
}
}
