package com.thread1.day10.Completablefuture1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
// summary the future is perform only one task and till the task is finished the get method is blocked the current thread.
		// but the completable future is type of pipe line process and it will finished the multiple task do and then it will give the get output 
		// but the both get is block the current thread .
		
		
//		CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
//			System.out.println(Thread.currentThread().getName());
//			return 10+20;
//		});
//		System.out.println(completableFuture.get());
		
		
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 10+20;
		}).thenApplyAsync((a) -> {
			System.out.println(Thread.currentThread().getName());
		return a+100;
		}).thenApplyAsync((a) -> {
			System.out.println(Thread.currentThread().getName());
			return "the result is :"+(a+10);
		});
		System.out.println(completableFuture.get());
	}
}
