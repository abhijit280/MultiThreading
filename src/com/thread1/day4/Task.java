package com.thread1.day4;

public class Task {

	public synchronized void print() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}
