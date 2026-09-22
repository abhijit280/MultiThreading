package com.thread1.day4;

public class Driver {

	public static void main(String[] args) {
		
		Task task1 = new Task();
		Task task2 = new Task();
		
		PrintThread printThread = new PrintThread(task1);
		Thread t1 = new Thread(printThread , "Ashish");
		t1.start();
		
		PrintThread printThread1 = new PrintThread(task2);
		Thread t2 = new Thread(printThread,"Abhijit");
		t2.start();
	}

}
