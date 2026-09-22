package com.thread1.day4.Priticse;

class MyThread extends Thread{
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
}
public class Driver {

	public static void main(String[] args) {
//		Creates a class MyThread by extending Thread.
//		Override the run() method.
//		Print numbers from 1 to 5 inside run().
//		In main(), create an object of MyThread.
//		Start the thread using start().
//		After starting it, print "Main thread" from the main() method.
		
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println(Thread.currentThread().getName());
	}

}
