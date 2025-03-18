package org.test.CoreJava.java8.stream;

import org.test.common.Database;
import org.test.common.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

    public static List<Employee> evaluateTaxUsers(String input) {
        return (input.equalsIgnoreCase("tax"))
                ? Database.getEmployeeDetails().stream()
                .filter(emp -> emp.getSalary() > 500000).collect(Collectors.toList())
                : Database.getEmployeeDetails().stream()
                .filter(emp -> emp.getSalary() <= 500000)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(evaluateTaxUsers("tax"));
    }
}
