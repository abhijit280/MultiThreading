package com.thread1.day7.ITC2;

import java.util.concurrent.locks.ReentrantLock;

public class Payment {

	Object object;
	Order order;

	public Payment(Object payment, Order order) {
		super();
		this.object = payment;
		this.order = order;

	}

	public void doPayment() {
		synchronized (object) {
			while (!order.orderDone) {
				try {
					object.wait();
				} catch (InterruptedException e) {
					 Thread.currentThread().interrupt();
		                return;
				}
			}
			
		
		System.out.println("Payment.doPayment(Processing>>>>>>)");
		System.out.println("Payment.doPayment(Payment Succesful>>>>>>>>>)");
		order.isPaymentdone = true;
		object.notify();
		}
	}
}
