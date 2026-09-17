package com.thread.day1;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("MyThread.run()"+Thread.currentThread().getName());
		Payment p1 = new Payment();
		p1.doPayment();
	}
}
public class HelloWorld {
	
	//there are two way to create the thread extend the thread class and implements the runable interface
	//then we will override the run merhod and write the code 
	//then create a thread object and call the start method

	public static void main(String[] args) throws InterruptedException {
		System.out.println("HelloWorld.main() "+Thread.currentThread().getName());
		
		Thread.currentThread().setName("[Main Thread]");
		MyThread t1 = new MyThread();
		t1.setName("Thread1");
		t1.start();
		
		MyThread t2 = new MyThread();
		t2.setName("Thread2");
		t2.start();
		
		MyThread t3 = new MyThread();
		t3.setName("Thread3");
		t3.start();
	//	Thread.currentThread().sleep(2000);
		
		HelloWorld helloWorld= new HelloWorld();
		helloWorld.doSomething();
		System.out.println("HelloWorld.main() END "+Thread.currentThread().getName());
		
	}
	public void doSomething() {
		System.out.println("HelloWorld.DoSomething() "+Thread.currentThread().getName());
	}

}
class Payment{
	public void doPayment() {
		System.out.println("Payment.doPayment()"+Thread.currentThread().getName());
	}
}
