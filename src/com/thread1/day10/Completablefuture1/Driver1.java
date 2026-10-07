package com.thread1.day10.Completablefuture1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Driver1 {

	public static void main(String[] args) /* throws InterruptedException, ExecutionException */ {

		// task 1  --
		CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 10+20;
		}).thenApplyAsync((a) -> {
			System.out.println(Thread.currentThread().getName());
		return a+200;
		});
		
		
		// task 2 --
		CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
			System.out.println(Thread.currentThread().getName());
			return 10+20;
		}).thenApplyAsync((a) -> {
			System.out.println(Thread.currentThread().getName());
		return a+100;
		});
		
		// combine the both ----
		CompletableFuture<Integer> result = completableFuture.thenCombineAsync(completableFuture1,(a,b) -> a+b);
		System.out.println(result/* .get() */ .join() );// join will doesn't throw exception.
										// get will throw the exception .

	}

}
