package com.thread1.day6.Praticse.Order;

public class OrderProcessThread extends Thread {

	private final Object lock;
	private final Order order;
	public OrderProcessThread(Object lock,Order order) {
		this.lock = lock;
		this.order = order;
	}
	public void run() {
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//		
//			e.printStackTrace();
//		}
		order.doOrder();
		System.out.println("OrderProcessThread.run(Procesing SUCCES)");
		synchronized (lock) {
			System.out.println("Payment Thread now you can Start");
			lock.notify();
		}
		
	}
	
	
}
