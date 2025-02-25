package org.test.concurrencyapi.CountdownLatch;

public class QaTeam  extends Thread{
    public QaTeam(String name) {
        super(name);
    }

    public void run(){
        System.out.println("Task is started QATeam" + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Task is finished QaTeam" + Thread.currentThread().getName());
    }

}
