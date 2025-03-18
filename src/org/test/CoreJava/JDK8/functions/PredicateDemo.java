package org.test.CoreJava.JDK8.functions;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {
// return the boolean values
	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		list1.stream()
				.filter(num -> num % 2 == 0)
				.forEach(t -> System.out.println("print  Even: " + t));

	}
}
