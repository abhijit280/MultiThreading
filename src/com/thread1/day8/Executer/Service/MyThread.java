package com.thread1.day8.Executer.Service;

public class MyThread extends Thread
{

	int taskId;
	public MyThread(int taskId) {
		this.taskId = taskId;
	}
	@Override
	public void run() {
		System.out.println("MyThread.run()...Task is runnint Task is : "+taskId +" [ "+Thread.currentThread().getName()+" ]");
	}
}
