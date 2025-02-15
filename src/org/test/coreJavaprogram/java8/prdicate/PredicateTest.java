package org.java.coreJavaprogram.java8.prdicate;


import org.java.coreJavaprogram.java8.fucntionalinterface.Predicate;

public class PredicateTest {
	 public static void main(String[] args) {
	        
	        Predicate<Integer> p = number -> (number % 2 == 0);
	        System.out.println(p.test(10));//true
	        System.out.println(p.test(11));//false
	    }
}
