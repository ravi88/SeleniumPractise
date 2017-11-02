package practise_java;
class A {
	 void test() {
	 System.out.println("Hi there");
	 } 
	void display() 
	{
		System.out.println("am a classs mthd");
	}
	}
public class B extends A {
	void display()               // display method is overrided in sub class and when ever we call 
	                            // display it displays sub class display only
	{ 
		//super.display();
		System.out.println("am b classs mthd");
	}
	public static void main(String[] args) {
		A b = new B();//upcasting
		b.display();
		B b1=(B) b;//downcasting
		b1.display();
		b1.test();
		
	}} 