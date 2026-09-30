package com.thread1.day9.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Driver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		

//		ExecutorService es = Executors.newFixedThreadPool(5);//it creates the 5 thread
		
		ExecutorService es = Executors.newCachedThreadPool();
		//based on the work it will create the thread how many required 
		for (int i = 0; i < 20; i++) {
			Message message = new Message("abhi@1234.com : "+i,  " the body is : "+i);
			MyThread myThread = new MyThread(message);
			Future<Boolean> future =  es.submit(myThread);
//			System.out.println("the status is : "+future.get());
	//here get method wait to the current Thread ,wait until it doesn't get the value  
		}
		es.shutdown();
	}

}
