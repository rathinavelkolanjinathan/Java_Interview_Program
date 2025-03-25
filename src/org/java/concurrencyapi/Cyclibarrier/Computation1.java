package org.java.concurrencyapi.Cyclibarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Computation1 implements Runnable
{
    private CyclicBarrier barrier;

    Computation1(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
        try {
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " has crossed the barrier.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
    }