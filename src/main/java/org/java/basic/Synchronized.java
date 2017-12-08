package org.java.basic;

public class Synchronized {

	private int val = 0;
	
	public static void main(String[] args)  {
		
		Synchronized obj = new Synchronized();
		obj.gointThroughLife();
	}
	
	public void gointThroughLife()  {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					add();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					subtract();
				}
			}
		});
		
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Value:"+val);
		
	}
	
	public synchronized void add() {
		val++;
	}
	
	public synchronized void subtract() {
		val--;
	}
	
	
}
