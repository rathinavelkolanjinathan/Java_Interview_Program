package org.test.CoreJava.java8.prdicate;



import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFilter {
	public static void main(String[] args) {
        
	      List<String> names = Arrays.asList(
	         "Peter",
	         "Martin",
	         "Alex",
	         "Philip",
	         "Piyush",
	         "Mike"
	        );
	
	Predicate<String> p= name->name.startsWith("P");
	//names.stream().filter(p).forEach(System.out::println);
	}
}
