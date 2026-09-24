package com.thread1.day4.Bank;

public class Thread1 extends Thread {

	private BankAccount sender;
	private BankAccount reciever;
	
	public Thread1(BankAccount sender ,BankAccount reciever) {
		this.reciever = reciever;
		this.sender = sender;
	}
	@Override
	public void run() {
		BankAccount.doTransaction(reciever, 800);
	}
}
