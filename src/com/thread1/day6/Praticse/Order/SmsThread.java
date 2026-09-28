package com.thread1.day6.Praticse.Order;

public class SmsThread extends Thread {
	
	public void run() {
		synchronized (this) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("SmsThread.run(PROCESSING SMS>>>>>>>>>)");
		sms();
	}

	public void sms() {
		System.out.println("SmsThread.sms(SENDING THE CONFIRMATION SMS >>>>>>>>)");
	}
}
