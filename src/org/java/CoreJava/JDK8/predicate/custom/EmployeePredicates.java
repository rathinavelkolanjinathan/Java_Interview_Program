package org.java.CoreJava.JDK8.predicate.custom;




import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class EmployeePredicates {
	  public static I<Employee> isAdultMale() {
	        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	    }
	     
	    public static I<Employee> isAdultFemale() {
	        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");
	    }
	     
	    public static I<Employee> isAgeMoreThan(Integer age) {
	        return p -> p.getAge() > age;
	    }
	     
		/*
		 * public static List<Employee> filterEmployees (List<Employee> employees,
		 * Predicate<Employee> predicate) { return employees.stream() .filter(predicate)
		 * .collect(Collectors.<Employee>toList()); }
		 */

	public static List<Employee> filterEmployees(List<Employee> employees,
													  Predicate<Employee> predicate) {
		return employees.stream()
				.filter(predicate)
				.collect(Collectors.<Employee>toList());
	}

	public static Predicate<Employee> isMale() {

		return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
	}
}
