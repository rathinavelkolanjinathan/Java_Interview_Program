package org.java.concurrencyapi.Queue;

import java.util.concurrent.locks.ReentrantLock;
//ReentrantLock is a class in Java's java.util.concurrent.locks package that
// provides a more advanced mechanism for locking compared to the built-in
// synchronized blocks and methods.
// Here are some key points about ReentrantLock
public class ReentrantLockExample {
   private final ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args) {

        ReentrantLockExample example = new ReentrantLockExample();

        Runnable task = example::performTask;

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();
    }

    public void performTask() {
        lock.lock(); // Acquire the lock
        try {
            // Critical section (code that requires synchronization)
            System.out.println("Thread " + Thread.currentThread().getName() + " is performing a task.");
        } finally {
            lock.unlock(); // Ensure the lock is released
        }
    }
}
