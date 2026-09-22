package com.thread1.day4;

public class PrintThread implements Runnable {

	Task task;
	public PrintThread(Task _task) {
		this.task = _task;
	}
	@Override
	public void run() {
		
		task.print();
	}

}
