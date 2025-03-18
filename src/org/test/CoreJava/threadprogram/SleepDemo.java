package org.test.CoreJava.threadprogram;

public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {

            System.out.println("Main -" + Thread.currentThread().getName());
            Thread.sleep(3000);
        }
    }
}
