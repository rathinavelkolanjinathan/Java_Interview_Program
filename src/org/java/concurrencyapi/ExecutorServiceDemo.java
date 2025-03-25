package org.java.concurrencyapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService executorServiceFirst = Executors.newSingleThreadExecutor();
        ExecutorService executorServiceSecond = Executors.newSingleThreadExecutor();

        executorServiceSecond.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    if (i % 2 != 0) {
                        System.out.println("Even Number" + i);
                    }
            }
        });


        executorServiceFirst.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i < 100; i++)
                    if (i % 2 == 0) {

                        System.out.println("Add Number" + i);
                    }
            }
        });
        executorServiceFirst.shutdown();
    }


}
