package org.java.features;

/*
 * Hashcode is an integer which represents internal address of object.
 * Hashcode differs from one object to another object.
 * Hashcode acts like an identity for an object.
 * Purpose of hashcode : Hashcode is used to store, remove, search in set and map collections. 
 * 						(hashset, hashmap)
 */
public class HashCode {

	static Integer a = 3;
	static Integer b = 2;
	
	public static void main(String[] args) {
		System.out.println(hashCode(a, b));
	}
	
	public static long hashCode(Integer a, Integer b) {
		
		long temp = a.hashCode() << b.hashCode();
		return temp;
	}
	
	
	
}
