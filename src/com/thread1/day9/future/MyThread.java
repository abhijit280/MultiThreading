package com.thread1.day9.future;

import java.util.concurrent.Callable;

public class MyThread implements Callable<Boolean> {
	Message message;
	
	public MyThread(Message message) {
		super();
		this.message = message;
	}

	public Boolean call() {
		System.out.println("Message Call().........");
		try {
			Thread.currentThread().sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message.doMessage(message.msg, message.body);
	}

}
