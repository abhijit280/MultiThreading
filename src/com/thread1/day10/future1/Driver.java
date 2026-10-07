package com.thread1.day10.future1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Driver {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService future = Executors.newFixedThreadPool(3);
		Future<String> order = future.submit(()->{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Order Processing.....";
		});
		
		Future<String> payment = future.submit(() -> {
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Payment Succesful ";
		});
		Future<String> invoice = future.submit(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Invoice Generator" ;
		});
		System.out.println(order.get());
		System.out.println(payment.get());
		System.out.println(invoice.get());
		future.shutdown();
	}
}
