package org.test.coreJavaprogram.threadprogram;

public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {

            System.out.println("Main -" + Thread.currentThread().getName());
            Thread.sleep(3000);
        }
    }
}
