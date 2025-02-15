package org.java.concurrencyapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();

        executorService1.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    if (i % 2 != 0) {
                        System.out.println("Even Number" + i);
                    }
            }
        });


        executorService.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i < 100; i++)
                    if (i % 2 == 0) {

                        System.out.println("Add Number" + i);
                    }
            }
        });
        executorService.shutdown();
    }


}
