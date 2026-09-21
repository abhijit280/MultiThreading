package com.thread1.day3;


class Print {
	public  void printer() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing : "+ i +" : "+Thread.currentThread().getName());
		}
	}
}
class PrintingTask1 extends Thread{
	Print task;
	public PrintingTask1(Print task) {
		this.task = task;
	}
	public synchronized void run() {
		task.printer();
	}
}
public class Driver2 {

	public static void main(String[] args) {
		Print print = new Print();
		PrintingTask1 task = new PrintingTask1(print);
		task.start();
		PrintingTask1 task1 = new PrintingTask1(print);
		task1.start();
	}

}
