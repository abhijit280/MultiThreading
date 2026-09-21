package com.thread1.day2;

class DoSomething1 extends Thread{
	@Override
	public void run() {
		System.out.println("DoSomething.run()");
		Driver2 d2 = new Driver2();
		d2.doSomething();
	}
}
public class Driver2 {

	public static void main(String[] args) {
		System.out.println("Driver2.main()");
		DoSomething1 t1 = new DoSomething1();
		t1.start();
		
	}
	public void doSomething() {
		System.out.println("Driver2.doSomething()");
	}
}
