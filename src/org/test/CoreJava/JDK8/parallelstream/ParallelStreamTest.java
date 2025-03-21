package org.test.CoreJava.JDK8.parallelstream;

import org.test.commons.Database;
import org.test.commons.Employee;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamTest {
    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain stream took time : " + (end - start));

        System.out.println("============================================");

        start = System.currentTimeMillis();
        IntStream.range(1, 100)
                .parallel()
                .forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel stream took time : " + (end - start));


        IntStream.range(1, 10).forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
        });

        IntStream.range(1, 10).parallel().forEach(x -> {
            System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
        });

        List<Employee> employees = Database.getEmployeeDetails();

        //normal
        start = System.currentTimeMillis();
        double salaryWithStream = employees.stream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();

        System.out.println("Normal stream execution time : " + (end - start) + " : Avg salary : " + salaryWithStream);

        start = System.currentTimeMillis();
        //using parallel stream
        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();

        end = System.currentTimeMillis();

        System.out.println("Parallel stream execution time : " + (end - start) + " : Avg salary : " + salaryWithParallelStream);
    }
}
