package com.thread1.day6;

class Do{
	public void Dosomething() {
//		Thread.currentThread().setPriority(10);
		Thread.yield();
		System.out.println("Do.Dosomething(>>>>>>>>>>>>>) [ "+Thread.currentThread().getPriority()+" ]");
	}
}
public class Driver1 {
public static void main(String[] args) {
	Do do1 = new Do();
	Thread t1 = new Thread(()-> do1.Dosomething());
	t1.start();
	Thread t2 = new Thread(()-> do1.Dosomething());
	t2.start();
	t2.setPriority(10);
	Thread t3 = new Thread(()-> do1.Dosomething());
	t3.start();
	
}
}
