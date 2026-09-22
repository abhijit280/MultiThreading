package com.thread1.day4.Bank;

public class BankAccount {

	private int balance = 1000;
	public synchronized void doTransaction(BankAccount reciever ,int _amount) {
		if (_amount <= balance) {
			System.out.println(Thread.currentThread().getName()+" : checked Balance : "+balance);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance = balance - _amount;
			reciever.balance = reciever.balance+_amount;
			System.out.println(Thread.currentThread().getName()+" : Transfered Balance : "+_amount);
		}
		else {
			System.out.println(Thread.currentThread().getName()+" : Insufficient Balance : ");
		}
		
		
	}
	public int getBalance() {
		return balance;
	}
}
