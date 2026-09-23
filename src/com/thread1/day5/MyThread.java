package com.thread1.day5;

public class MyThread extends Thread {

	BankAccount bank;
	int amount;

	public MyThread(BankAccount bank,int amount,String name) {
		super(name);
		this.amount = amount;
		this.bank = bank;
		
	}
	public void run() {
		BankAccount.doTransaction(amount);
	}
}
