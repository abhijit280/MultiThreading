package com.thread1.day3;

class MyThread implements Runnable
{

	@Override
	public void run() {
		System.out.println("MyThread.run(>>>>>>>>>>)"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
	}
	
}
public class Driver {

	public static void main(String[] args) {
		System.out.println("Driver.main(START>>>>>>>>>>)");
		MyThread t1 = new MyThread();
		Thread t2 = new Thread(t1);
		t2.start();
		System.out.println(t2.getPriority()+Thread.currentThread().getName());
		
		System.out.println("Driver.main(END>>>>>>>)");
	}

}
