package com.thread1.day7.ReentrantLock;

public class Driver {

	public static void main(String[] args) {
		
		Task task = new Task();
		Thread t1 = new Thread(()->{
			task.doSomething();
		});
		
		Thread t2 = new Thread(()->{
			task.doSomething();
		});
		t1.start();
		t2.start();

	}

}
