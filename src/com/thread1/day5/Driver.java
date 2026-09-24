package com.thread1.day5;

public class Driver {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		MyThread t1 = new MyThread(account, 800,"abhijit");
		t1.start();
		MyThread t2 = new MyThread(account, 800,"pradhan");
		t2.start();
		System.out.println(account.getBalance());
	}

}
