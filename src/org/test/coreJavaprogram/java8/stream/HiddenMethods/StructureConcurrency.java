package org.java.coreJavaprogram.java8.stream.HiddenMethods;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StructureConcurrency {
    public static void main(String[] args) throws InterruptedException {
        // This method is common thread
        Thread creditCard = new Thread(() -> {
            System.out.print(Thread.currentThread().getName());
        });

        Thread employement = new Thread(() -> {

            System.out.print(Thread.currentThread().getName());
        });

        creditCard.start();
        employement.start();
        creditCard.join();
        employement.join();
        System.out.print("All check is completed");


    }
}
