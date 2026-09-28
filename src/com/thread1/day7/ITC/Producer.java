package com.thread1.day7.ITC;

public class Producer extends Thread{

	Task task;
	public Producer(Task task) {
		this.task = task;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				task.produce(i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
