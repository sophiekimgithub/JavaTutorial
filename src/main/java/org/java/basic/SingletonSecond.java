package org.java.basic;

public class SingletonSecond {

	public SingletonSecond() {
		
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		System.out.println("Second Class");
		System.out.println("i="+singletonClass.i);
	}
}
