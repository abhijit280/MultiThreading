package com.thread1.day4.Priticse1;

public class BankAccount {

	private static int balance = 1000;

	public static synchronized void doTransaction(int amount) {
		System.out.println("BankAccount.doTransaction(START>>>>>>>>>>>>>>>)");
		
		synchronized (BankAccount.class) {

			if (balance >= amount) {
				balance = balance - amount;
				System.out.println(Thread.currentThread().getName() + "  you succesfuly do your transaction of 800 ");
			} else {
				System.out.println(Thread.currentThread().getName()
						+ "  you have the insufficient fund of 800 to do send  : the current balance is " + balance);
			}
		}
		System.out.println("BankAccount.doTransaction(END>>>>>>>>>>>>>)");
	}

	public int getBalance() {
		return balance;
	}
}
