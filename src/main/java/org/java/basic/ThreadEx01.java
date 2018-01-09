package org.java.basic;

import java.util.ArrayList;
import java.util.List;

public class ThreadEx01 {

	
	public static void main(String[] args) {
		List<Thread> threadList = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			Thread thread = new Thread01(i);
		}
	}
}

class Thread01 extends Thread {
	
	int seq;
	
	public Thread01(int seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		System.out.println(this.seq + " thread START");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(this.seq + " thread End");
	}
}
