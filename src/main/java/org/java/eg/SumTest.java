package org.java.eg;

public class SumTest {

	public static void main(String[] args) {
		//int result = sum(4);
		//int result = multi(4);
		//double result = power(2, 3);
		//int result = fibonacci(6); 
		double result = gcd(2, 30);
		System.out.println(result);
		
	}
	
	/* sum(0,n) */
	public static int sum(int n) {
		if(n<=0) {
			return 0;
		}
		return n + sum(n-1);
	}

	/* n! */
	public static int multi(int n) {
		if(n==0) 
			return 1;
		return n * multi(n-1);
	}
	
	/* 2^n */
	public static double power(double x, int n) {
		if(n==0) 
			return 1;
		return x * power(x, n-1);    
	}
	
	/* Fibonacci */
	public static int fibonacci(int n) {
		if(n<=1) 
			return n;
		else 
			return fibonacci(n-1) + fibonacci(n-2); 
	}
	
	/* The greatest common divisor */
	public static double gcd(int m, int n) {
//		if(m<n) {
//			int temp;
//			temp = m;
//			m = n;
//			n = temp;
//		}
		
		if(m%n==0) 
			return n;
		else 
			return gcd(n, (m%n));
	}

}
