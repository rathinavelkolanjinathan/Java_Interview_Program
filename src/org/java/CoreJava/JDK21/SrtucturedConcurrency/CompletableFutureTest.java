package org.java.CoreJava.JDK21.SrtucturedConcurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    public static void main(String[] args) {
        // In case any issue like below need to handle failure means it
        // will execute next thread also

        CompletableFuture<String> withException = CompletableFuture.supplyAsync(()
                        -> "Credit check failed for issue " + 10 / 0 + Thread.currentThread().getName())
                .exceptionally(ex -> "Exception is Occurred.." + ex.getMessage());

        CompletableFuture<String> creditCardCheckFuture = CompletableFuture.supplyAsync(()
                -> "Credit check processed by " + Thread.currentThread().getName());


        CompletableFuture<String> employeeCheckFuture = CompletableFuture.supplyAsync(()
                -> "Employee Check by " + Thread.currentThread().getName());

        CompletableFuture<Void> resultFuture =
                CompletableFuture.allOf(creditCardCheckFuture, employeeCheckFuture, withException);
        resultFuture.thenRun(() -> {
            withException.join();
            String creditCard = creditCardCheckFuture.join();
            String employee = employeeCheckFuture.join();
            System.out.println("creditCard" + creditCard);
            System.out.println("employee" + employee);
        }).join();
    }
}
// Problem
// manual handling issue
// resource management if use custom exceutors