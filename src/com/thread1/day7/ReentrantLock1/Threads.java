package com.thread1.day7.ReentrantLock1;


class ProduceThread extends Thread {
	Test test ;

	public ProduceThread(Test task) {
		super();
		this.test = task;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			test.produce(i);
		}
	}
}
class ConsumeThread extends Thread {
	Test test;

	public ConsumeThread(Test test) {
		super();
		this.test = test;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			test.consume();;
		}
	}
}