package com.thread1.day1;


class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("MyThread.run()");
		Driver d1 = new Driver();
		d1.dosome();
	}
	
}
public class Driver {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);//THREAD IS CREATED   
		t1.start();//THREAD STARTED AND PERFORM AND END IF ONCE END THEN IT DOESNT START 
		t1.start();//it will throw the exception because this thread is already ended
	}
	public void dosome() {
		System.out.println("Driver.dosome()"+Thread.currentThread().getName());
	}

}
