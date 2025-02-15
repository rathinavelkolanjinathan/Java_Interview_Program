package org.java.concurrencyapi;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PrintOddEvenNumberUseExecutor {
    public static void main(String[] args) {

        ExecutorService firstExecutorService = Executors.newSingleThreadExecutor(r -> {
            Thread thread = new Thread(r);
            thread.setName("first");
            return thread;
        });

        ExecutorService secondExecutorService = Executors.newSingleThreadExecutor(r -> {
            Thread thread = new Thread(r);
            thread.setName("second");
            return thread;
        });

        IntStream.range(1, 101).forEach(num -> {
            CompletableFuture<Integer> completableFuture =
                    CompletableFuture.completedFuture(num)
                            .thenApplyAsync(x -> {
                                if (x % 2 == 1) {
                            System.out.println(x + " " + Thread.currentThread().getName());
                        }
                        return num;
                    }, firstExecutorService);
            completableFuture.join();

            CompletableFuture<Integer> completableFuture2 =
                    CompletableFuture.completedFuture(num).thenApplyAsync(x -> {
                        if (x % 2 == 0) {
                            System.out.println(x + " " + Thread.currentThread().getName());
                        }
                        return num;
                    }, secondExecutorService);
            completableFuture2.join();
        });

        firstExecutorService.shutdown();
        secondExecutorService.shutdown();
    }
}
