package org.java.CoreJava.JDK8.stream.HiddenMethods;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LoanApprovalExecutorService {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Exceutor
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<String> employee = executor.submit(() -> {
            System.out.println("Checking employement Verification" + Thread.currentThread().getName());
            Thread.sleep(100);
            return "Employee verification is :approved";
        });

        Future<String> creditCard = executor.submit(() -> {
            System.out.println("Checking CreditCard verification" + Thread.currentThread().getName());
            Thread.sleep(100);
            return "CreditCard verification is :approved";
        });

        String emp = employee.get();
        String credit = creditCard.get();

        System.out.println("emp " + emp);
        System.out.println("credit " + credit);
        //Shutdown the executor
        executor.shutdown();

    }
}
