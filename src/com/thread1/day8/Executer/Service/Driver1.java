package com.thread1.day8.Executer.Service;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyTHread1 implements Callable<Integer> {
	Driver1 driver1 = new Driver1();

	public Integer call() {
		int num = driver1.addNum(10, 20);
	
		System.out.println(Thread.currentThread().getName());
		return num ;
	}
}

public class Driver1 {

	public int addNum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyTHread1 t1 = new MyTHread1();
		
		MyTHread1 t2 = new MyTHread1();
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			Future< Integer> fu =  es.submit(new MyTHread1());
			System.out.println("Result : "+fu.get());
		} 
//		 Future< Integer> fu1 =  es.submit(new MyTHread1());
//		 
//		 System.out.println("Result1 : "+fu1.get());
		 es.shutdown();
	}

}
