package com.thread1.day7.ITC1;

public class Task {

	int data;
	boolean isDataAvailable = false;
	 public synchronized void producer(int _data) throws InterruptedException {
		 while (isDataAvailable) {
			wait();
		}
		 this.data = _data;
		 isDataAvailable = true;
		 System.out.println("Data Produce : "+data);
		 notify();
	 }
	 public synchronized void consumer() throws InterruptedException {
		 while ( !isDataAvailable) {
			wait();
		}
		 isDataAvailable = false;
		 System.out.println("Data consume : "+data);
		 notify();
	 }
}
