package org.test.concurrencyapi.CountdownLatch;

import java.util.concurrent.CountDownLatch;

public class DevTeam extends Thread {
    private CountDownLatch countDownLatch;

    public DevTeam(CountDownLatch latch, String name) {
        super(name);
        this.countDownLatch = latch;
    }

    public void run() {
        System.out.println("Task is started DevTeam" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Task is finished DevTeam" + Thread.currentThread().getName());
    }
}
