package org.java.basic;

class Equality {
	int x;
	int y;
	boolean isequal() {return (x==y);}
}

public class MethodTest {

	public int xyz(int num) {
		if(num==1) return 1;
		else return (xyz(num-1)+num);
	}
	
	public static void main(String[] args) {
		//1.
		MethodTest obj = new MethodTest();
		System.out.println(obj.xyz(100));
		
		//2.
		Equality a = new Equality();
		a.x = 5;
		a.y = 5;
		System.out.println(a.isequal());
	}
}
