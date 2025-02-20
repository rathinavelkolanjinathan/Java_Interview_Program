package org.test.coreJavaprogram.JDK21.SrtucturedConcurrency;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
    public static void main(String[] args) {
        // in case any issue like below need to handle failure meand it will excute next thread also

        CompletableFuture<String> withexception = CompletableFuture.supplyAsync(()
                        -> "Credit check failed for issue " + 10/0+Thread.currentThread().getName())
                .exceptionally(ex ->"Exception is occured"+ex.getMessage());

        CompletableFuture<String> creditCardCheckFuture = CompletableFuture.supplyAsync(()
                -> "Credit check processed by " + Thread.currentThread().getName());



        CompletableFuture<String> employeeCheckFuture = CompletableFuture.supplyAsync(()
                -> "Employee Check by " + Thread.currentThread().getName());

        CompletableFuture<Void> resultFuture =
                CompletableFuture.allOf(creditCardCheckFuture, employeeCheckFuture,withexception);
        resultFuture.thenRun(() -> {
            withexception.join();
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