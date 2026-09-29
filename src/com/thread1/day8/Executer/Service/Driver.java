package com.thread1.day8.Executer.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Driver {

	public static void main(String[] args) {
		
		//we are going use the executorService
		ExecutorService executorService = Executors.newFixedThreadPool(6);
//		executing 10 task  with the help of 6 thread
		for (int i = 0; i < 10; i++) {
			MyThread task = new MyThread(i);
			executorService.execute(task);
		}
//shutdown is used for shutdown the service otherwise it will keep it running 
		executorService.shutdown();
	}

}
