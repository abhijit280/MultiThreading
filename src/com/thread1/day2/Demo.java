package com.thread1.day2;

import java.util.Iterator;

class DoSomething extends Thread{
	public void run() {
		for (int i = 1; i < 20; i++) {
			System.out.println("number : "+i+" :  "+Thread.currentThread().getId()+" :  "+Thread.currentThread().getName());
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		DoSomething thread1 = new DoSomething();
		thread1.start();
		DoSomething thread2 = new DoSomething();
		thread2.start();
	}

}
