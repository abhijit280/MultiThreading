package com.thread.day1;

class MyThreads1 extends Thread{
	@Override
	public void run() {
		System.out.println("MyThread.run()"+Thread.currentThread().getName());
	}
}
public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Demo.main(  START .......)"+Thread.currentThread().getName());
		MyThreads1 t1 = new MyThreads1();
		t1.start();
		MyThreads1 t2 = new MyThreads1();
		t2.start();
		MyThreads1 t3 = new MyThreads1();
		t3.start();
		MyThreads1 t4 = new MyThreads1();
		t4.start();
	System.out.println("Demo.main(END>>>>>.......)"+Thread.currentThread().getName());	
	}

}
