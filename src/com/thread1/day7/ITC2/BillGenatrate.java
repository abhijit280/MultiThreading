package com.thread1.day7.ITC2;

import java.util.concurrent.locks.ReentrantLock;

public class BillGenatrate {

	Order order;
	Object object;

	public BillGenatrate(Object object,Order _order) {
		super();
		this.order = _order;
		this.object = object;
	}

	public void generateBill() {
		synchronized (object) {
			while (!order.isOrdersucces) {
				try {
					object.wait();
				} catch (InterruptedException e) {
					 Thread.currentThread().interrupt();
		                return;
				}
			}
		}
		System.out.println("BillGenatrate.generateBill(Processing>>>>>>>>.)");
		System.out.println("BillGenatrate.generateBill(Payment Succesful>>>>>>>>)");
	}

}
