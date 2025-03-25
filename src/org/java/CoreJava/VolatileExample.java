package org.java.CoreJava;
//the volatile keyword is used to indicate that a variable’s value can be
// modified by multiple threads.
// When a variable is declared as volatile ,
// any changes made to it by one thread are immediately visible to all other threads.
//The volatile keyword is best suited for cases where multiple threads read and write
// to a single variable without complex operations or dependencies.
public class VolatileExample {
    private volatile boolean running = true;

    public void run() {
        System.out.println("Thread started.");
        while (running) {
            // Simulate some work
        }
        System.out.println("Thread stopped.");
    }

    public void stop() {
        running = false; // Set the flag to stop the thread
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();
        Thread thread = new Thread(example::run);
        thread.start();

        // Let the thread run for a moment
        Thread.sleep(1000);
        example.stop(); // Signal the thread to stop
        thread.join(); // Wait for the thread to finish
    }
}
