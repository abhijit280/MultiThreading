package com.thread1.day7.ITC2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Order {

	Object object;
	boolean orderDone = false;
	boolean isPaymentdone = false;
	boolean isOrdersucces = false;

	public Order(Object order) {
		super();
		this.object = order;
	}

	public void order() {

		synchronized (object) {

			System.out.println("Order.Order(Processing>>>>>>>>)");
			orderDone = true;
			object.notify();
			while (!isPaymentdone) {
				try {
					object.wait();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					return;
				}
			}
			System.out.println("Order.Order(Order Sucessful>>>>>>>>>)");
			isOrdersucces = true;
			object.notify();

		}

	}
}
