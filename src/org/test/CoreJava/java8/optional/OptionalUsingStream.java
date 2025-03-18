package org.test.CoreJava.java8.optional;

import org.test.common.Database;
import org.test.common.Employee;

import java.util.List;

public class OptionalUsingStream {
    public static void main(String[] args) throws Exception {
        Employee e = OptionalUsingStream.getSalary(60000);
        System.out.print(e);

        Customer customer = getCustomer("kolanjirathna@gmail.com");


    }

    public static Customer getCustomer(String email) throws Exception {
        // List<Customer> cus = DatabaseList.getAll();
        // return cus.stream().filter(customer -> customer.getEmail().equals(email)).findAny().orElse(new Customer());

        List<Customer> cus = DatabaseList.getAll();

        return cus.stream().filter(customer ->
                        customer.getEmail()
                                .equals(email))
                .findAny()
                .orElseThrow(() -> new Exception("No mail id is present "));

    }


    public static Employee getSalary(int salary) {
        List<Employee> list = Database.getEmployeeDetails();
        return list.stream().filter(employee -> employee.getSalary() == salary).findAny().get();
    }
}
