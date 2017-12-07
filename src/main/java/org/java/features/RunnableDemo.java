package org.java.features;

public class RunnableDemo implements Runnable{

	private String threadName;
	private Thread t;
	
	RunnableDemo(String name) {
		threadName = name;
		System.out.println(threadName + " is created.");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(threadName + " is running.");
		
		try {
			for(int i=0; i<5; i++) {
				System.out.println(threadName + "," + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(threadName + " is terminated.");
		
	}
	
	public void start() {
		System.out.println(threadName + " is started.");
		if(t==null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	
	public static void main(String[] args) {
		RunnableDemo R1 = new RunnableDemo("Thread - 1");
		R1.start();
		
		RunnableDemo R2 = new RunnableDemo("Thread - 2");
		R2.start();
	}

}
