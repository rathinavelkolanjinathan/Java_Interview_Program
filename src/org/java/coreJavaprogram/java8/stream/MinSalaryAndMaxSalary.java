package org.java.coreJavaprogram.java8.stream;

import org.java.common.Database;
import org.java.common.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinSalaryAndMaxSalary {
    public static void main(String[] args) {


        //Minimum salary
        List<Employee> minimumSalary = Database.getEmployeeDetails()
                .stream()
                .filter(salary -> salary.getSalary() > 50000)
                .collect(Collectors.toList());
        System.out.println("Minimum Salary" + minimumSalary);

        //max salary
        Optional<Employee> maxSalary = Database.getEmployeeDetails()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble
                        (Employee::getSalary)));


        System.out.println("Maximum Salary" + maxSalary.get());

        //second max
        Optional<Employee> secondMaxSalary = Database.getEmployeeDetails()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed())
                .skip(1)
                .findFirst();
        System.out.println("Second MaxSalary" + secondMaxSalary.get());

        // System.out.println(employee);
    }
}
