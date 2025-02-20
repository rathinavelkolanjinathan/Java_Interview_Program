package org.test.coreJavaprogram.java8.sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.test.common.Database;
import org.test.common.Employee;

public class ListSort {

	public static void main(String[] args) {

		List<Employee> emp = Database.getEmployeeDetails();

		//using lambda expression
		Collections
				.sort(emp, ( o1,  o2) ->(int) (o1.getSalary() - o2.getSalary()));

		//System.out.println(employees);
		
		
		//employees.stream().sorted(( o1,  o2) ->(int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);
		
		//employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);

		         emp.stream()
				.sorted(Comparator.comparing(Employee::getDept))
				.forEach(System.out::println);
		/*
		 * Collections.sort(list);//ASSENDING Collections.reverse(list);
		 * System.out.println(list);
		 * 
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println
		 * (s));//descending
		 */

	}
}
