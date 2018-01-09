package org.java.basic;

class A{
	
	public String y() {
		return "public";
	}
	
	private String z() {
		return "private";
	}
	
	public String x() {
		return z();
	}
}
enum Fruit2 {
	GRAPH("purple"), AVOCADO("green"), CHERRY("red");
	private String color;
	public String getColor() {
		return this.color;
	}
	Fruit2(String color) {
		this.color = color;
	}
}

enum Fruit{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	public String getColor(){
		return this.color;
	}
	Fruit(String color) {
		this.color = color;
	}
}

public class AccessDemo1 {
	public static void main(String[] args) {
		A a = new A();
		//System.out.println(a.z());
		System.out.println(a.x());
		
		for(Fruit f:Fruit.values()) {
			System.out.println(f);
		}
		
		for(Fruit2 f:Fruit2.values()) {
			System.out.println(f);
		}
		
	}
}
