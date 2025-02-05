package org.java.concurrencyapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service1 = Executors.newSingleThreadExecutor();

        service1.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++)
                    if (i % 2 != 0) {
                        System.out.println("ev" + i);
                    }
            }
        });


        service.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 2; i < 100; i++)
                    if (i % 2 == 0) {

                        System.out.println("Add" + i);
                    }
            }
        });
        service.shutdown();
    }


}
