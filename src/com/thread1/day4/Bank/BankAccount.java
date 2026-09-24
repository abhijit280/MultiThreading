package com.thread1.day4.Bank;

public class BankAccount {

	private static int balance = 1000;
	private static int rcvbalance = 1000;
	public static synchronized void doTransaction(BankAccount reciever ,int _amount) {
		if (_amount <= balance) {
			System.out.println(Thread.currentThread().getName()+" : checked Balance : "+balance);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BankAccount.balance = BankAccount.balance - _amount;
			BankAccount.rcvbalance = BankAccount.rcvbalance+_amount;
			System.out.println(Thread.currentThread().getName()+" : Transfered Balance : "+_amount);
		}
		else {
			System.out.println(Thread.currentThread().getName()+" : Insufficient Balance : ");
		}
		
		
	}
	public int getBalance() {
		return balance;
	}
	public int getrcvBalance() {
		return rcvbalance;
	}
}
