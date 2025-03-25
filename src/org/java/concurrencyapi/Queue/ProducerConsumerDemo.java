package org.java.concurrencyapi.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerDemo {
    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread procucerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        procucerThread.start();
        consumerThread.start();

    }
}
