package com.thread1.day6.Praticse.Order;

public class Driver {

	public static void main(String[] args) {
		Object objectLock = new Object();
		Order order = new Order();
		SmsThread smsThread = new SmsThread();
		
		OrderProcessThread orderThread = new OrderProcessThread(objectLock,order);
		PaymentThread payTHread = new PaymentThread(smsThread,objectLock);
		
		
		orderThread.start();
		payTHread.start();
		smsThread.start();

		try {
			orderThread.join();
			payTHread.join();
			smsThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
