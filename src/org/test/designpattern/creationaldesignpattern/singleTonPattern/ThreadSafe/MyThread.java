package org.test.designpattern.creationaldesignpattern.singleTonPattern.ThreadSafe;

public class MyThread implements Runnable {
    @Override
    public void run() {
        Singleton sin = Singleton.getInstance();
        System.out.println("Thread" + Thread.currentThread().getName()+" "+sin.hashCode());
    }
}
