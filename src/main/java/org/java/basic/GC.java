package org.java.basic;

public class GC {
	
	public  static void main(String[] args) {
		
		//1. When the object is no longer reachable
		GC obj = new GC();
		obj = null;				
		System.out.println("1");
		
		char[] hello = {'h','e','l','l','o'};
		String str = new String(hello);
		str = null;
		System.out.println("2");
		
		//2. When one reference is copied to another reference
		GC obj1 = new GC();
		GC obj2 = new GC();
		obj2 = obj1;
		System.out.println("3");
		
		System.gc();
	}
	
	protected void finalize() throws Throwable {
		System.out.println("GC run by JVM");
	}
	
}