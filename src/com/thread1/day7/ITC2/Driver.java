package com.thread1.day7.ITC2;

public class Driver {

	public static void main(String[] args) {
		Object object = new Object();
		Order order = new Order(object);
		Payment payment = new Payment(object,order);
		BillGenatrate billGenatrate = new BillGenatrate(object,order);
		
		OrderThread t1 = new OrderThread(order);
		PaymentThread t2 = new PaymentThread(payment);
		BillThread t3 = new BillThread(billGenatrate);
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e) {
			e.getMessage();
		}

		System.out.println("finished");

	}

}
