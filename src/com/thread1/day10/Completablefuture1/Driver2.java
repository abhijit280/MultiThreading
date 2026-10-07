package com.thread1.day10.Completablefuture1;

import java.util.concurrent.CompletableFuture;

public class Driver2 {

	
	public static void main(String[] args) {
		Methods methods = new Methods();

        CompletableFuture<String> stock =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        return methods.checkStatus();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                });

        CompletableFuture<String> payment =
                CompletableFuture.supplyAsync(() -> {
                    try {
                        return methods.processingPayment();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                });

        CompletableFuture<Void> result = stock.thenCombine(payment, (a, b) -> {
                System.out.println(a);
                System.out.println(b);

                return methods.confirmOrder();
            })
            .thenApply(order -> {
                System.out.println(order);

                return methods.sendEmail();
            })
            .thenAccept(email -> {
                System.out.println(email);
            });

       
        System.out.println("Main thread is free...");
        result.join();
    }
}


class Methods {
	
	public  String checkStatus() throws InterruptedException {
		Thread.sleep(3000);
		return "the stock is avialable ";
	}
	public String processingPayment() throws InterruptedException {
		Thread.sleep(2000);
		return "payment is Processing ";
	}
	public String confirmOrder() {
		return "Order confirmed Succesfully ";
	}
	public String sendEmail() {
		return "Email  Send succesful";
	}
}