package com.thread1.day6;

class Task{
	public void doSomething() {
		System.out.println("Task.doSomething()"+Thread.currentThread().getName());
	}
	
}
class Things extends Thread
{
	Task task;
	public Things(Task task ) {
	
		this.task = task;
	}
	@Override
	public void run() {
		task.doSomething();
	}
}
class Things1 implements Runnable{

	@Override
	public void run() {
		
		
	}
	
}
public class Driver {

	public static void main(String[] args) {
		  Task task = new Task();
		Things t1 = new Things( task );
		t1.start();
		Things t2 = new Things( task );
		t2.start();
	}

}
