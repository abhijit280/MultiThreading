package com.thread1.day8.Volatile;

import java.util.concurrent.atomic.AtomicInteger;

//
//class MyThread extends Thread {
//	Increase increase;
//	public MyThread(Increase increase) {
//		this.increase = increase;
//	}
//	public void run() {
//		for (int i = 0; i < 300; i++) {
//			 increase.countIncrease();
//		}
//		
//	}
//}
//class Increase {
//	volatile int count;
//	public int countIncrease() {
//		 return count++;
//	}
//	
//}
//public class Driver {
//
//	public static void main(String[] args) throws InterruptedException {
//		Increase increase = new Increase();
//		
//		MyThread t1 = new MyThread(increase);
//		MyThread t2 = new MyThread(increase);
//
//		t1.start();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		
//		System.out.println(increase.count);
//	}
//
//}

class MyThread extends Thread {
	Increase increase;
	public MyThread(Increase increase) {
		this.increase = increase;
	}
	public void run() {
		for (int i = 0; i < 300; i++) {
			 increase.countIncrease();
		}
		
	}
}
class Increase {
	AtomicInteger count = new AtomicInteger(0);
	public int countIncrease() {
		
		 return count.getAndIncrement();
	}
	
}
public class Driver {

	public static void main(String[] args) throws InterruptedException {
		Increase increase = new Increase();
		
		MyThread t1 = new MyThread(increase);
		MyThread t2 = new MyThread(increase);

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(increase.count);
	}

}
