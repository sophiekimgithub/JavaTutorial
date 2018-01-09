package org.java.basic;

public class MethodTest2 {
	
	public static void main(String[] args) {
	
		boolean a = true;
		boolean b = true;
		
		if(a) {
			System.out.println("TEST1");
		} else {
			System.out.println("TEST2");
		}
		
		if(a) {
			System.out.println("A");
		} else if(a&&b) {
			System.out.println("A&&B");
		} else {
			if(!b) {
				System.out.println("!B");
			} else {
				System.out.println("B");
			}
		}
		
		MethodTest2 obj = new MethodTest2();
		obj.start();
	}
	
	void start() {
		int a = 3;
		int b = 4;
		System.out.println("" + 7 + 2 + "");
		System.out.println(a+b);
		System.out.println("" + a + b + "");
		System.out.println(foo() + a + b);
		System.out.println(a + b + foo());
		System.out.println(foo2() + a + b);
	}
	
	String foo() {
		return "mocha";
	}
	int foo2() {
		return 3;
	}
}
