package org.java.designpattern.creational.singletonpattern.ThreadSafe;

public class MyThread implements Runnable {
    @Override
    public void run() {
        SingletonThreadSafe sin = SingletonThreadSafe.getInstance();
        System.out.println("Thread" + Thread.currentThread().getName()+" "+sin.hashCode());
    }
}
