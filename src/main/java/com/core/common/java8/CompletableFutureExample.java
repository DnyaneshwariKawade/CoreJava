package com.core.common.java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> future=CompletableFuture.supplyAsync(()-> {
            sleep(2000);
            System.out.println("Task1 completed");
            return "result of task1";
        }).thenApply(result->{
            System.out.println("Processing:: "+result);
            return result.length();
        }).thenAccept(length->{
            System.out.println("Length of the result: "+length);
        });
        future.get();
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
