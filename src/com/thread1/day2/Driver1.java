package com.thread1.day2;
 class Process implements Runnable{

	@Override
	public synchronized void run() {
		System.out.println("Process.run(>>>>>>>>>>>>>>)"+Thread.currentThread().getName());
		
	}
	 
 }
public class Driver1 {
	
	static int x = 10;
	static {
		System.out.println(x);
		
		System.out.println("XYZ");
	}
	
	static int y = 15;
	
	static {
		System.out.println("MNO");
	}

	public static void main(String[] args) {
		 Process p1 = new Process();
		 Process p2 = new Process();
		 Thread t1 = new Thread(p1);
		 t1.start();
		 Thread t2 = new Thread(p2);
		 t2.start();
	}
	
}
