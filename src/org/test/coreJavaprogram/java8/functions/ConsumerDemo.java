package org.test.coreJavaprogram.java8.functions;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class ConsumerDemo {
	private static final Logger logger = Logger.getLogger(ConsumerDemo.class.toString());
	public static void main(String[] args) {
		/*
		 * Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);
		 * 
		 * consumer.accept(10);
		 */

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		list1.stream()
				.forEach(result -> logger.info("print  : " + result));

	}
}
