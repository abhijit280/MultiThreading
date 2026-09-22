package com.thread1.day4.Priticse1;

public class BankAccount {

	private int balance = 1000;
	 public synchronized void doTransaction(int amount) {
		 if (balance>=amount) {
			balance = balance - amount;
			System.out.println(Thread.currentThread().getName()+"  you succesfuly do your transaction of 800 ");
		}
		 else {
			System.out.println(Thread.currentThread().getName()+"  you have the insufficient fund of 800 to do send  : the current balance is "+balance);
		}
		
	 }
	 public int getBalance() {
		 return balance;
	 }
}
