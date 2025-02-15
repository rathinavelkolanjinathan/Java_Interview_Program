package org.java.threadprogram;

public class ThreadLocalProgram {

    // Create a ThreadLocal variable
    private static final ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 1);

    public static void main(String[] args) {
        // Create two threads
        Thread thread1 = new Thread(() -> {
            // Get the initial value
            System.out.println("Thread 1 initial value: " + threadLocal.get());
            // Set a new value
            threadLocal.set(100);
            System.out.println("Thread 1 updated value: " + threadLocal.get());
        });

        Thread thread2 = new Thread(() -> {
            // Get the initial value
            System.out.println("Thread 2 initial value: " + threadLocal.get());
            // Set a new value
            threadLocal.set(200);
            System.out.println("Thread 2 updated value: " + threadLocal.get());
        });

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
