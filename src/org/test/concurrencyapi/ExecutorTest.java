package org.test.concurrencyapi;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {

            executor.execute(new ExecutorTest.Task());
        }
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
