package org.java.CoreJava.threadprogram;

public class SynchronizedDemo2 {
    public static void main(String[] args) {
        Institute2 institute2 = new Institute2();
        MyThread1 myThread1 = new MyThread1(institute2, "Raj");
        MyThread1 myThread2 = new MyThread1(institute2, "kolanji");
        myThread1.start();
        myThread2.start();
        institute2.exam();
    }
}
