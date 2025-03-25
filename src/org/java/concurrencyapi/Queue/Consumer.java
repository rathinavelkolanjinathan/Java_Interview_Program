package org.java.concurrencyapi.Queue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Object item = queue.take();
                System.out.println("Consumed" + item);
            }

        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();

        }

    }
}
