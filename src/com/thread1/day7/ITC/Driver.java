package com.thread1.day7.ITC;

public class Driver {
	//ITC Inter ThreadComunication
	public static void main(String[] args) {
		Task task = new Task();
		Producer producer = new Producer(task);
		Consumer consumer = new Consumer(task);
		producer.setName("produce");
		consumer.setName("consumer");
		producer.start();
		consumer.start();
	}
	
}
