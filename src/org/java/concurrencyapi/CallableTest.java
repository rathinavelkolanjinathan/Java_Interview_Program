package org.java.concurrencyapi;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableTest implements Callable<Integer> {
    private int input;

    public CallableTest(int input) {
        super();
        this.input = input;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        int sum = 0;
        for (int i = 0; i < input; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //Main Method
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        Future fu = ex.submit(new CallableTest(10));
        try {
            System.out.println("Executor" + fu.get());
            try {
                System.out.println("Executor" + fu.get(2, TimeUnit.SECONDS));
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }

}
