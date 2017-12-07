package org.java.features;

public class ThreadDemo extends Thread{
	
	private String threadName;
	private Thread t;
	
	ThreadDemo(String name) {
		System.out.println(name+" is created.");
		threadName = name;
	}
	
	public void run() {
		System.out.println(threadName+" is running.");
	
		try {
			for(int i=0; i<5; i++) {
				System.out.println(threadName+", "+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(threadName+" is terminated.");
	}
	
	
	public void start() {
		System.out.println(threadName+" is started.");
		if(t==null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	
	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("Thread - 1");
		t1.start();
		
		ThreadDemo t2 = new ThreadDemo("Thread - 2");
		t2.start();
	}

}
