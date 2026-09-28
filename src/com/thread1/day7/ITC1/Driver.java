package com.thread1.day7.ITC1;

public class Driver {

	public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(()->
		{for (int i = 0; i < 10; i++) {
			try {
				task.producer(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
		
		Thread thread2 = new Thread(()->
		{for (int i = 0; i < 10; i++) {
			try {
				task.consumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}});
		
		thread.start();
		thread2.start();
		
		

	}

}
