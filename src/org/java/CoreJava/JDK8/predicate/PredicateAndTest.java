package org.java.CoreJava.JDK8.predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateAndTest {
    public static void main(String[] args) {

        //Iterable m=new HashMap();

        Predicate<Integer> p1 = number -> (number % 2 == 0);
        Predicate<Integer> p2 = number -> (number > 10);

        // number should be divisible by 2 and greater than 10
        // System.out.println(p1.and(p2).java(10));//false
        //System.out.println(p1.and(p2).java(12));//true

        List<String> names = Arrays.asList(
                "Peter",
                "Martin",

                "Alex",
                "Philip",
                "Piyush",
                "Mike"
        );

        Predicate<String> p3 = name -> name.startsWith("P");
        Predicate<String> p4 = name -> !name.endsWith("p");

        // find a name starts with "P" and not ends with "p"
	     /*   names.stream()
	             .filter(p3.and(p4))
	             .forEach(System.out::println);
	    }*/
    }
}
