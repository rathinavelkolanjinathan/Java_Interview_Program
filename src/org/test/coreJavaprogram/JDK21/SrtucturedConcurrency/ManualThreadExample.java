package org.test.coreJavaprogram.JDK21.SrtucturedConcurrency;

public class ManualThreadExample {

    // manually handling the thread and any issue is come next thread is not execute
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread is starting  ");
        Thread creditScore = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        Thread employee = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        creditScore.start();
        employee.start();
        creditScore.join();
        employee.join();
        System.out.println("All check is completed ");
    }
}
