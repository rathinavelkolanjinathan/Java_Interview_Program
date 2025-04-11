package org.java.CoreJava.JDK8.parallelstream;

import org.java.commons.Database;
import org.java.commons.Employee;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamTest {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain Stream Took Time....." + (end - start));

        System.out.println("============================================");

        start = System.currentTimeMillis();
        IntStream.range(1, 100)
                .parallel()
                .forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("Parallel Stream Took Time..." + (end - start));

        System.out.println("============================================");

        IntStream.range(1, 10).forEach(x -> {
            System.out.println("Thread used Normal Thread...." + Thread.currentThread().getName() + " : " + x);
        });

        IntStream.range(1, 10)
                .parallel()
                .forEach(x -> {
            System.out.println("Thread Used Parallel...." + Thread.currentThread().getName() + " : " + x);
        });


        System.out.println("============================================");
        //normal
        List<Employee> listEmp = Database.getEmployeeDetails();

        start = System.currentTimeMillis();
        double salaryWithStream = listEmp.stream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("Normal Stream Execution Time...." + (end - start) + " : Average Salary...." + salaryWithStream);

        System.out.println("============================================");
        start = System.currentTimeMillis();
        //using parallel stream
        double salaryWithParallelStream = listEmp.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();

        end = System.currentTimeMillis();

        System.out.println("Parallel Stream Execution Time...." + (end - start) + " : Avg salary...." + salaryWithParallelStream);
    }
}
