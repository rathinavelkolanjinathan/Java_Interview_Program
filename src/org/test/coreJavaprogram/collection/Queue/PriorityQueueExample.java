package org.test.coreJavaprogram.collection.Queue;

import java.time.LocalDate;
import java.util.PriorityQueue;
import java.util.logging.Logger;

public class PriorityQueueExample {
	private static final Logger logger = Logger.getLogger(PriorityQueueExample.class.toString());
	public PriorityQueueExample() {
	}

	public static void main(String[] args) {
		PriorityQueue<PriorityQueueTest> queue = new PriorityQueue<PriorityQueueTest>();
		PriorityQueueTest t1 = new PriorityQueueTest(1L, "Kolanji", LocalDate.now());
		PriorityQueueTest t2 = new PriorityQueueTest(2L, "rathna", LocalDate.now());
		PriorityQueueTest t3 = new PriorityQueueTest(3L, "priya", LocalDate.now());
		PriorityQueueTest t4 = new PriorityQueueTest(4L, "praveen", LocalDate.now());
		PriorityQueueTest t5 = new PriorityQueueTest(5L, "anjala", LocalDate.now());
		queue.add(t1);
		queue.add(t2);
		queue.add(t3);
		queue.add(t4);
		queue.add(t5);
		PriorityQueueTest e = queue.poll();

		// System.out.println(e);
		logger.info("Queue "+queue);
		/*
		 * while(true) { PriorityQueueTest e=queue.poll(); System.out.println(e);
		 * if(e==null)break;
		 * 
		 * }
		 */
	}
}
