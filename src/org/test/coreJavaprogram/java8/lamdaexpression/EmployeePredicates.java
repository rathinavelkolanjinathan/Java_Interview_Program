package org.test.coreJavaprogram.java8.lamdaexpression;

import org.test.coreJavaprogram.java8.prdicate.PrdicateTest;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	public static Predicate<PrdicateTest> isMale(){
		
		return p->p.getAge()>21 && p.getGender().equalsIgnoreCase("M");
	}
	public static List<PrdicateTest> filterEmployees (List<PrdicateTest> employees,
            Predicate<PrdicateTest> predicate){
        return employees.stream()
                .filter( predicate )
                .collect(Collectors.<PrdicateTest>toList());
}
	
}
