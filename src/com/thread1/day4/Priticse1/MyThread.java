package com.thread1.day4.Priticse1;

public class MyThread extends Thread {

	BankAccount account ;
	int ammount;
	public MyThread(BankAccount account ,int ammount,String name) {
		super(name);
		this.account = account;
		this.ammount = ammount;
	}
	public void run() {
		BankAccount.doTransaction(ammount);
	}
}
