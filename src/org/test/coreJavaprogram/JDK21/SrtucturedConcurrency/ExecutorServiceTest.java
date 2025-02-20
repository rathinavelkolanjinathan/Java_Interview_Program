package org.test.coreJavaprogram.JDK21.SrtucturedConcurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ExecutorServiceTest {
    // manual error handling and resource managemnt(manually shutdown)
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> creditScore = executorService.submit(() -> {
            System.out.println("Checking card score" + Thread.currentThread().getName());
            Thread.sleep(100);
            return "Credit Card score is : good";
        });

        Future<String> employee = executorService.submit(() -> {
            System.out.println("Checking Employee score" + Thread.currentThread().getName());
            Thread.sleep(100);
            return "Employee Verification is Approved ";
        });

        String credit = creditScore.get();
        String emp = employee.get();

        System.out.println("Checking Check " + credit);
        System.out.println("Employee Check " + emp);
        executorService.shutdown();
    }
}
