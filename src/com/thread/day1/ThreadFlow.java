package com.thread.day1;

class MyThreads extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread.run() "+i+" "+Thread.currentThread().getName());
		}
	}
	
}
public class ThreadFlow {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("ThreadFlow.main(START)");
		MyThreads t1 = new MyThreads();
		t1.start();
		MyThreads t2 = new MyThreads();
		t2.start();
		Thread.sleep(100);
		System.out.println("ThreadFlow.main(END)");
	}
}
