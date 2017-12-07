package org.java.features;

public class MyThread2 implements Runnable{

	private int n = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(n<10) {
			n++;
			System.out.println("n:"+n);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		MyThread2 ob = new MyThread2();
		Thread th = new Thread(ob);
		th.start();
		
		int i = 0;
		while(i<10) {
			i++;
			System.out.println("i:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
