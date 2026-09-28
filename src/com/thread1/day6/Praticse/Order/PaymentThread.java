package com.thread1.day6.Praticse.Order;

public class PaymentThread extends Thread {

	private final Object lock;
	private final SmsThread smsThread;
	public PaymentThread(SmsThread smsThread,Object lock) {
		this.lock = lock;
		this.smsThread = smsThread;
	}
	public void run() {
		synchronized (lock) {
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("PaymentThread.run(PROCESING>>>>>>>>>)");
		
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doPayment();
		
		synchronized (smsThread) {
			System.out.println();
			smsThread.notify();
		}
	}
	public void doPayment() {
		
		System.out.println("PaymentThread.doPayment(SUCESS>>>>>>>)");
	}
}
