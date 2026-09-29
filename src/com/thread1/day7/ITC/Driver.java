package com.thread1.day7.ITC;

public class Driver {
	//ITC Inter ThreadComunication
	public static void main(String[] args) {
		Task task = new Task();
		Producer producer = new Producer(task);
		Consumer consumer = new Consumer(task);
		Producer producer1 = new Producer(task);
		Consumer consumer1 = new Consumer(task);
		producer.setName("produce");
		consumer.setName("consumer");
		producer1.setName("produce1");
		consumer1.setName("consumer1");
		producer.start();
		consumer.start();
		producer1.start();
		consumer1.start();
	}
	
}
