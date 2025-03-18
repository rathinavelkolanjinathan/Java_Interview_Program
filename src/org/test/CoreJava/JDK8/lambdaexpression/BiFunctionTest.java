package org.test.CoreJava.JDK8.lambdaexpression;

import java.util.function.BiFunction;

public class BiFunctionTest {

	public static void main(String[] args) {
		/*
		 * BiFunctionInter<Integer, Integer, String> bi = (Integer i, Integer j) -> {
		 * 
		 * int square = i * i; int square2 = j * j; return "The result" + square +
		 * square2; };
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Please enter the No"); int firstNo = sc.nextInt(); int
		 * secNo = sc.nextInt(); bi.apply(firstNo, secNo);
		 */
		 BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result:" +(num1 + num2);
	        System.out.println(biFunction.apply(20,25));
	}

}
