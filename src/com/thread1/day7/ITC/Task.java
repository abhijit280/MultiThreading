package com.thread1.day7.ITC;

public class Task {

	int data;
	boolean isDataAvialable = false;
	
	public synchronized void produce(int _data) throws InterruptedException {
		while (isDataAvialable) {
			System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getState());
			wait();
			}
			this.data = _data;
			System.out.println("produce the data : "+data);
			isDataAvialable = true;
			System.out.println("Producer notify to the Consumer........");
			notify();
		
	}
	public synchronized void consumer() throws InterruptedException {
		while (! isDataAvialable) {
			System.out.println(Thread.currentThread().getName()+" : Is Wating.....");
			wait();
			}
			System.out.println("consumer the data : "+data);
			isDataAvialable = false;
			System.out.println("Consumer notify to the Producer........");
			notify();
		
	}
}
