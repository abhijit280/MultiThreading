package com.thread1.day7.ReentrantLock1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Test {
	int data;
	boolean available = false;
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();

	public void produce(int data) {
		lock.lock();
		try {
			while (available) {
				condition.await();
			}
			available = true;
			this.data = data;
			System.out.println("the data is : " + data);
			condition.signal();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} finally {
			lock.unlock();
		}
	}

	public void consume() {
		lock.lock();
		try {
			while (!available) {

				condition.await();
			}
			System.out.println("Consumer the data : " + data);
			available = false;
			condition.signal();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		} finally {
			lock.unlock();
		}
	}

}

public class Driver {

	public static void main(String[] args) {

		Test test = new Test();
		ProduceThread t1 = new ProduceThread(test);
		ConsumeThread t2 = new ConsumeThread(test);
		t1.start();
		t2.start();
	}
}
