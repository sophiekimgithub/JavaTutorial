package org.java.basic;


class SuperC01 {
	public int i;
	protected int j;
	protected int k;
}

class ChildC01 extends SuperC01 {
	int j;
	void display() {
		System.out.println(i+":"+j+":"+k);
	}
}

public class AccessDemo2 {
	
	public static void main(String[] args) {

		ChildC01 obj = new ChildC01();
		obj.i = 1;
		obj.j = 2;
		obj.k = 3;
		obj.display();
	}

}
