package com.thread1.day8.ReentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Task{
	int num;
	boolean data = false;
	Lock lock = new ReentrantLock();
	Condition condition = lock.newCondition();
	
	public void doPrint(int num) 
	{
		lock.lock();
		try {
			while (data) {
				condition.await();
			}
			data = false;
			System.out.println("Number : "+num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
		
	}
}
public class Driver {

	public static void main(String[] args) {
		Task task = new Task();
		Thread t1 = new Thread(()->{
			for (int i = 0; i < 10; i++) {
				task.doPrint(i);		
			}});	
		Thread t2 = new Thread(()->{
			for (int i = 0; i < 10; i++) {
				task.doPrint(i);		
			}});
		t1.start();
		t2.start();
	}

}
