package com.thread1.day2;


class Thread1  extends Thread{
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
			
		}
		Thread1 thread1 = new Thread1();
		thread1.start();
	}
}
class Thread3 extends Thread{
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i+" : "+Thread.currentThread().getName());
			
		}
		Thread2 thread2 = new Thread2();
		thread2.start();
	}
}
public class Test {

	public static void main(String[] args) {
		
				for (int i = 0; i <= 5; i++) {
					System.out.println(i+" : "+Thread.currentThread().getName());
					
				}
				Thread3 thread3 = new Thread3();
				thread3.start();
			
		

	}

}
