package org.java.concurrencyapi.Queue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                queue.put(i);
                System.out.println("Producer" + i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
