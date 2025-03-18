package org.test.CoreJava.JDK8.stream.HiddenMethods;

import java.util.concurrent.CompletableFuture;

public class LoanApplicationCompletableFeature {
    public static void main(String[] args) {
        CompletableFuture<String> creditCard = CompletableFuture.supplyAsync(() ->
                        "Creditcard" + Thread.currentThread().getName() + 10 / 0
                // return "creditCard";
        ).exceptionally(ext -> "Exception is Occured"); // so  here also exception is handled the manually

        CompletableFuture<String> employee = CompletableFuture.supplyAsync(() -> "Employee " +
                        Thread.currentThread().getName()
                //return "Employee";
        );
// combined the thread
        CompletableFuture<Void> allTask = CompletableFuture.allOf(creditCard, employee);

        allTask.thenRun(() -> {
            String credit = creditCard.join();
            String emp = employee.join();

            System.out.println("credit" + credit);
            System.out.println("emp" + emp);

        }).join();
    }
}
