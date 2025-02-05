package org.java.designpattern.singleTonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(3);
        MyThread thread = new MyThread();
        ex.execute(thread);
        ex.shutdown();
    }
}
