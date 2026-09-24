package com.thread1.day2;
 class Process implements Runnable{

	@Override
	public synchronized void run() {
		System.out.println("Process.run(>>>>>>>>>>>>>>)"+Thread.currentThread().getState());
		System.out.println("Process.run(>>>>>>>>>>>>>>)"+Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
	}
	 
 }
public class Driver1 {
	
	

	public static void main(String[] args) {
		 Process p1 = new Process();
		// Process p2 = new Process();
		 Thread t1 = new Thread(   );
		 t1.start();
		 Thread t2 = new Thread(p1);
		 t2.start();
	}
	
}
