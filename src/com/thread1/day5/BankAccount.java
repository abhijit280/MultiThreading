package com.thread1.day5;

public class BankAccount {
	private static int balance = 1000;

	public static/* synchronized */ void doTransaction(int amount) {//here this take as class lock each class have the one lock
	synchronized (BankAccount.class) {  //this the way to block lable synchronized in a class lock
		
	
		if (balance>=amount) {
		balance = balance-amount;
		System.out.println(Thread.currentThread().getName()+" BankAccount.doTransaction(  SUCCESFUL   >>>>>>)");
	}
	else {
		System.out.println(Thread.currentThread().getName()+" BankAccount.doTransaction(   INSUFICIENT FUND   >>>>>>>>>>)");
	}
	}
}
public int getBalance() {
	return balance;
}
}
