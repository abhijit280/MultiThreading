package com.thread1.day3;

class Task implements Runnable{
	public void run() {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				try {
					System.out.println("the threrad is sleeping now ........../TIMED_WATING");
					Thread.sleep(5000);
					System.out.println("sleeping is over and now iam in RUNNABLE state and ready to do work");
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			System.out.println("Task.run() : "+i);
		}
	}
}
public class Driver1 {

	public static void main(String[] args) {
		Task task =new Task();
		Thread t1 = new Thread(task);
		t1.start();

	}

}
