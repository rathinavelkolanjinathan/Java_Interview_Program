package org.test.coreJavaprogram.JDK21.SrtucturedConcurrency;

import java.util.concurrent.ExecutionException;
//import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrencyTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
      /*  try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            var creditCard = scope.fork(() -> {
                System.out.println("CreditCard" + 10 / 0 + Thread.currentThread().getName());
                return "card";
            });

            var employee = scope.fork(() -> {
                System.out.println("Employee" + Thread.currentThread().getName());
                return "card";
            });
            // wait for finish all task
            scope.join();
            scope.throwIfFailed();
            System.out.println("Task is completed ....");

        }*/
    }
}
