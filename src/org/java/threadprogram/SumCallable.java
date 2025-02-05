package org.java.threadprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class SumCallable implements Callable<Integer> {

    private int input;

    public SumCallable(int input) {
        super();
        this.input = input;

    }

    @Override
    public Integer call() throws Exception {

        // Thread.sleep(1000);
        Thread.sleep(3000);
        int sum = 0;
        for (int i = 1; i <= input; i++) {

            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService exe = Executors.newFixedThreadPool(10);
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> fut = exe.submit(new SumCallable(i));

            System.out.println("return " + fut.get());

        }

        for (Future f : list) {
            System.out.println(f.get(2, TimeUnit.SECONDS));
        }
    }

}
