package org.java.CoreJava.JDK8.stream.HiddenMethods;

public class StructureConcurrency {
    public static void main(String[] args) throws InterruptedException {
        // This method is commons thread
        Thread creditCard = new Thread(() -> {
            System.out.print(Thread.currentThread().getName());
        });

        Thread thread = new Thread(() -> {

            System.out.print(Thread.currentThread().getName());
        });

        creditCard.start();
        thread.start();
        creditCard.join();
        thread.join();
        System.out.print("All check is completed");


    }
}
