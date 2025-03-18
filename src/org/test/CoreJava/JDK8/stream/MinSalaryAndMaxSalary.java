package org.test.CoreJava.JDK8.stream;

import org.test.commons.Database;
import org.test.commons.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinSalaryAndMaxSalary {
    public static void main(String[] args) {

        //Minimum salary
        List<Employee> minimumSalary = Database.getEmployeeDetails()
                .stream()
                .filter(salary -> salary.getSalary() > 500)
                .collect(Collectors.toList());
        //minimumSalary.stream().forEach(a-> System.out.println(a));
        System.out.println("Minimum Salary......" + minimumSalary);

        //max salary
        Optional<Employee> maxSalary = Database.getEmployeeDetails()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble
                        (Employee::getSalary)));

        System.out.println("Max Salary....." + maxSalary.get());

        Optional<Employee> minSalary = Database.getEmployeeDetails()
                .stream()
                .collect(Collectors.minBy(Comparator.comparingDouble
                        (Employee::getSalary)));

        System.out.println("Minimum Salary....." + minSalary.get());

        //second max
        Optional<Employee> secondMaxSalary = Database.getEmployeeDetails()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed())
                .skip(1)
                .findFirst();
        System.out.println("Second MaxSalary....." + secondMaxSalary.get());

        // System.out.println(employee);
    }
}
