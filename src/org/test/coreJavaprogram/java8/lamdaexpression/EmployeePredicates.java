package org.test.coreJavaprogram.java8.lamdaexpression;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicates {

	public static Predicate<Prdicate_Test> isMale(){
		
		return p->p.getAge()>21 && p.getGender().equalsIgnoreCase("M");
	}
	public static List<Prdicate_Test> filterEmployees (List<Prdicate_Test> employees, 
            Predicate<Prdicate_Test> predicate){
        return employees.stream()
                .filter( predicate )
                .collect(Collectors.<Prdicate_Test>toList());
}
	
}
