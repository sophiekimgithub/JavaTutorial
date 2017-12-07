package org.java.features;

public class LambdaDemo1 {

	//1. syntax : parameter -> expression body
	//2. optional type declaration 
	//3. optional parenthesis around parameter for single parameter
	//4. optional curly braces if body contains a single statement
	//5. optional return keyword
	
	public static void main(String[] args) {
		LambdaDemo1 tester = new LambdaDemo1();
		
		//with type declaration
		MathOperation addtion = (int a, int b) -> a+b;
		
		//without type declaration
		MathOperation subtraction = (a, b) -> a-b;
		
		//with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {return a*b; };
		
		//without return statement without curly braces
		MathOperation division = (int a, int b) -> a/b;
		
		System.out.println("10 + 5 = "+tester.operation(10, 5, addtion));
		System.out.println("10 - 5 = "+tester.operation(10, 5, subtraction));
		System.out.println("10 * 5 = "+tester.operation(10, 5, multiplication));
		System.out.println("10 / 5 = "+tester.operation(10, 5, division));
		
		//with parenthesis
		GreetingService greetService1 = (message) -> System.out.println("Hello " + message);
		
		//without parenthesis
		GreetingService greetService2 = message -> System.out.println("Hello " + message);
		
		greetService1.sayMessage("Sophie");
		greetService2.sayMessage("Tom");
	}
	
	interface MathOperation { 
		int operation(int a, int b);
	}
	
	interface GreetingService { 
		void sayMessage(String message);
	}
	
	private int operation(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
	
}