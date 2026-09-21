package com.thread1.day3;


class Process implements Runnable {

    @Override
    public synchronized void run() {

        for (int i = 1; i <= 3; i++) {
            System.out.println(
                Thread.currentThread().getName() + " : " + i
            );
        }
    }
}
public class Driver3 {

	public static void main(String[] args) {
		
		Process p1 = new Process();

		Thread t1 = new Thread(p1, "Thread-1");
		

		t1.start();
		
		Thread t2 = new Thread(p1, "Thread-2");
		t2.start();
	}

}
