package org.java.basic;

public class GC2 {
	
	
	public static void main(String[] args) {
	
		GC2Data obj = new GC2Data("white");
		
		for(int i = 0; i<10000; i++) {
			
			if(i%2==0) {
				obj = new GC2Data("green");
			} else {
				obj = new GC2Data("red");
			}
		}
		
		obj = null;
		
		System.gc();
	}
}

class GC2Data {
	
	private String color;
	
	public GC2Data(String color) {
		this.color = color;
	}
	
	protected void finalize() throws Throwable {
		System.out.println(color + " is destroyed.");
	}
}
