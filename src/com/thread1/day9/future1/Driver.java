package com.thread1.day9.future1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Driver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		List<Integer> price = new ArrayList<Integer>();
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Future<Integer> indigoService = executorService.submit(()->{
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 120;
		});
		Future<Integer> airIndiaService = executorService.submit(()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 95;
		});
		Future<Integer> spicerService = executorService.submit(()->{
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return 110;
		});
		try {
			int indigoprice = indigoService.get();
			price.add(indigoprice);
			System.out.println("The price if Indigo Ticket : "+indigoprice);
		} catch (Exception e2) {
			System.out.println("The exception occur");
		}
		try {
			int airindiaprice = airIndiaService.get();
			System.out.println("The price if AirIndia Ticket : "+airindiaprice);
			price.add(airindiaprice);
		} catch (Exception e2) {
			System.out.println("The exception occur");
		}

		try {
			int spiprice = spicerService.get(5,TimeUnit.SECONDS);
			 
		} catch (InterruptedException e) {
			
			System.out.println("Timed out (Ignored)");
		} catch (ExecutionException e) {
			System.out.println("Timed out (Ignored)");
		} catch (TimeoutException e) {
			System.out.println("Timed out (Ignored)");
		}   
		if (!price.isEmpty()) {
			int minprice = Collections.min(price);
			System.out.println("the minimum price is : "+minprice);
		} 

		executorService.shutdown();// its showdown the pools active worker thread
	}

}
