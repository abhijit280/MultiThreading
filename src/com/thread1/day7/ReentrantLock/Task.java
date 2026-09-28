package com.thread1.day7.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Task {

	ReentrantLock reentrantLock = new ReentrantLock();
	public void doSomething() {
		reentrantLock.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("Task.doSomething() ["+Thread.currentThread().getName()+"] and "+i);
		}
	
		reentrantLock.unlock();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Task.doSomething() ["+Thread.currentThread().getName()+"] and "+i);
		}
		
		
		reentrantLock.lock();
		for (int i = 0; i < 10; i++) {
			System.out.println("Task.doSomething() ["+Thread.currentThread().getName()+"] and "+i);
		}
	
		reentrantLock.unlock();
	}
}
