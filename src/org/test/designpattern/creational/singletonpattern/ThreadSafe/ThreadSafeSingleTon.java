package org.test.designpattern.creational.singletonpattern.ThreadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeSingleTon {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1);
        try {

            MyThread my = new MyThread();
            service.execute(my);
            service.execute(my);
            service.execute(my);
        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            if (service != null) {
                service.shutdown();
            }
        }


    }
}
