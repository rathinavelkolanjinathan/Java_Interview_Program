package org.test.coreJavaprogram.threadprogram;

public class EvenAndOddPrinterTwoThreads implements Runnable {
    static int count = 1;
    Object object;

    public EvenAndOddPrinterTwoThreads(Object object) {
        this.object = object;
    }

    @Override
    public void run() {

        while (count <= 100) {
            if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread Name : " + Thread.currentThread().getName() + " value :" + count);
                    count++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println("Thread Name : " + Thread.currentThread().getName() + " value :" + count);
                    count++;
                    object.notify();
                }
            }

        }

    }

    public static void main(String[] args) {
        Object lock= new Object();
        Runnable r1=new EvenAndOddPrinterTwoThreads(lock);
        Runnable r2=new EvenAndOddPrinterTwoThreads(lock);
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();
    }
}
