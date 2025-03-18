package org.test.CoreJava.JDK8.sorting;

import org.test.commons.Database;
import org.test.commons.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSort {

    public static void main(String[] args) {

        List<Employee> emp = Database.getEmployeeDetails();

        //using lambda expression
        Collections
                .sort(emp, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));

        //System.out.println(employees);


        //employees.stream().sorted(( o1,  o2) ->(int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);

        //employees.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::println);

        emp.stream()
                .sorted(Comparator.comparing(Employee::getDept))
                .forEach(System.out::println);

        //sort the based on department by name
        emp.stream().filter(e -> e.getDept().equals("IT"))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

		// Need only name
		List<String> ee = emp.stream()
				.map(Employee::getName).collect(Collectors.toList());
		//System.out.print(ee);
		// length based
		List<String> nameLength= emp.stream()
                .filter(e->e.getName().length()>5)
                .map(e->e.getName())
                .collect(Collectors.toList());

		System.out.print("Length"+nameLength);
        /*
         * Collections.sort(list);//ASSENDING Collections.reverse(list);
         * System.out.println(list);
         *
         * list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println
         * (s));//descending
         */

    }
}
