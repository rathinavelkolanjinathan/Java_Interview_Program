package org.test.CoreJava.JDK8.sorting;

import org.test.commons.Database;
import org.test.commons.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomizeListSorting {

    public static void main(String[] args) {


        List<Employee> list = Database.getEmployeeDetails();
        //Old Model
        Collections.sort(list, new Comparator<Employee>() {

            public int compare(Employee emp1, Employee emp2) {
                //ascending order
                // return (int) (emp1.getSalary() - emp2.getSalary());
                //descending  order
                return (int) (emp2.getSalary() - emp1.getSalary());
            }
        });
        // System.out.println(list);

        //Lambda implements
        //Ascending order  Method1
        Collections.sort(list, (emp1, emp2) ->
                (int) (emp1.getSalary() - emp2.getSalary()));
        // System.out.println("Labda sort "+list);


        //Using Stream to sort the list values

        //Method2
        list.stream()
                .sorted((emp1, emp2) ->
                        (int) (emp1.getSalary() - emp2.getSalary()))
                .forEach(System.out::println);

        //Method3
        list.stream()
                .sorted(Comparator.comparing(emp -> emp.getSalary()))
                .forEach(System.out::println);
        //Method4
        list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);
    }
}
