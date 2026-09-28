package com.thread1.day7.ITC;

public class Consumer extends Thread{

	Task task;
	public Consumer(Task task) {
		this.task = task;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				task.consumer();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
