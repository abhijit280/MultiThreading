package com.thread1.day9.future;

import java.util.concurrent.Callable;

public class Message {
	String msg;
	String body;
	
	public Message(String msg, String body) {
		super();
		this.msg = msg;
		this.body = body;
	}

	public boolean doMessage(String msg,String body) {
		System.out.println(msg+body+"[ "+Thread.currentThread().getName()+" ]");
		return true;
		
	} 

}
