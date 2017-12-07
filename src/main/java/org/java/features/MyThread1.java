package org.java.features;

public class MyThread1 extends Thread{

	private int n = 0;
	public void run() {
		while(n<10) {
			n++;
			System.out.println("n:"+n);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread1 ob = new MyThread1();
		ob.start();
		
		int i = 0;
		while(i<10) {
			i++;
			System.out.println("i:"+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
