package com.thread1.day6;

class Do{
	public void Dosomething() {
		System.out.println("Do.Dosomething(>>>>>>>>>>>>>)");
	}
}
public class Driver1 {
public static void main(String[] args) {
	Do do1 = new Do();
	Thread t1 = new Thread(()-> do1.Dosomething());
	t1.start();
}
}
