package org.java.concurrencyapi.CountdownLatch;

import java.util.concurrent.CountDownLatch;
// Ex:- Theater show for example one show is completed then only allow to other show
// same way one thread is execution is completed then allow to other thread execution
public class CountDownLatchMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Size of main "+args.length);
        CountDownLatch latch1 = new CountDownLatch(3);
        DevTeam dev = new DevTeam(latch1, "dev-a");
        DevTeam dev2 = new DevTeam(latch1, "dev-b");
        dev.start();
        dev2.start();
        latch1.await();
        QaTeam qa = new QaTeam("QaTeam");
        qa.start();

    }
}
