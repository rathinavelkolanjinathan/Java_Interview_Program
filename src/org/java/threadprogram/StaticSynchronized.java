package org.java.threadprogram;

public class StaticSynchronized {
    public static synchronized void wish(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Good Morning: ");
            System.out.println(name);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
        }
    }
}

class MyThread2 extends Thread {
    StaticSynchronized staticSynchronized;
    String name;

    MyThread2(StaticSynchronized d, String name) {
        this.staticSynchronized = d;
        this.name = name;
    }

    public void run() {
        staticSynchronized.wish(name);
    }
}

class Main {
    public static void main(String arg[]) {
        StaticSynchronized d1 = new StaticSynchronized();
        StaticSynchronized d2 = new StaticSynchronized();
        MyThread2 t1 = new MyThread2(d1, "Dhoni");
        MyThread2 t2 = new MyThread2(d2, "Yuvaraj");
        t1.start();
        t2.start();
    }
}
