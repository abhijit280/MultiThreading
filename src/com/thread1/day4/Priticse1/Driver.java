package com.thread1.day4.Priticse1;

public class Driver {
	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		MyThread myThread = new MyThread(account, 800, "THREAD-1");
		myThread.start();
		
		MyThread myThread1 = new MyThread(account, 800, "THREAD-2");
		myThread1.start();
		try {
		myThread.join();
		myThread1.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("this is the final balance "+account.getBalance());
	}
}
