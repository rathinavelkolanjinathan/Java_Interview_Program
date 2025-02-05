package org.java.concurrencyapi;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorFramework {
    public static void main(String[] args) {
        Executor ex = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 100; i++) {

            ex.execute(new ExecutorFramework.Task());
        }
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
