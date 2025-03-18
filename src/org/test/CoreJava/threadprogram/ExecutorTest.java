package org.test.CoreJava.threadprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorTest implements Callable<Integer> {
    private final int input;
    public ExecutorTest(int input) {
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

    public static void main(String[] args) throws InterruptedException,
            ExecutionException, TimeoutException {
        ExecutorService exe = Executors.newFixedThreadPool(5);
        List<Future<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Future<Integer> fut = exe.submit(new ExecutorTest(i));
            System.out.println("return " + fut.get());
        }

        for (Future f : list) {
            System.out.println("test"+f.get(2, TimeUnit.SECONDS));
        }
    }

}
