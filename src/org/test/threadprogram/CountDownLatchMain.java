package org.test.threadprogram;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMain {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(2);
        CountDownDevA teamA = new CountDownDevA(latch, "dev-A");
        CountDownDevB teamB = new CountDownDevB(latch, "dev-B");
        teamA.start();
        teamB.start();
        try {
            latch.await();
            CountDownTestQATeam team = new CountDownTestQATeam("QTeam");
            team.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
