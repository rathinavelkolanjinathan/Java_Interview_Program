package org.test.coreJavaprogram.java8.prdicate;


public class PredicateTest {
	 public static void main(String[] args) {
	        
	        Predicate<Integer> p = number -> (number % 2 == 0);
	        System.out.println(p.test(10));//true
	        System.out.println(p.test(11));//false
	    }
}
