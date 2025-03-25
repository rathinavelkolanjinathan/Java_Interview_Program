package org.java.concurrencyapi.Cyclibarrier;
// All the thread waiting for one to other
//Ex:- friends go to outing waiting for one to another in same place assigned then
// start going to travel


import java.util.concurrent.CyclicBarrier;

//The CyclicBarrier in Java is a synchronization and that allows a set of threads
// to all wait for each other to reach a commons barrier point. It is useful in scenarios
// where you want to perform some action after
// a fixed number of threads have reached a certain point.
public class CyclicBarrierMain {
    public static void main(String[] args) {
        final int threadCount = 3;
        CyclicBarrier barrier = new CyclicBarrier(threadCount, new Runnable() {
            @Override
            public void run() {
                System.out.println("All threads have reached the barrier. Let's proceed!");
            }
        });

        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new Computation1(barrier));
            thread.start();
        }
    }
}