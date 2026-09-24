package com.thread1.day4.Bank;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		BankAccount sender = new BankAccount();
		BankAccount reciever = new BankAccount();
		Thread1 thread = new Thread1(sender, reciever);
		Thread1 thread2 = new Thread1(sender, reciever);
		thread.start();
		thread2.start();
		
		thread.join();
		//System.out.println(Thread.currentThread().getState());
		thread2.join();
		System.out.println("Sender Account Balance : "+sender.getBalance());
		System.out.println("Reciever Account Balance : "+reciever.getrcvBalance());
	}
}
