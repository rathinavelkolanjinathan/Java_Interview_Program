package org.test.CoreJava.JDK8.stream;

import org.test.commons.Database;
import org.test.commons.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByName {

    public static void main(String[] args) {
        List<Employee> emp = Database.getEmployeeDetails();
        List<Employee> employee = emp.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
                employee.forEach(System.out::println);
    }
}
