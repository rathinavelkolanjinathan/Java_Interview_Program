package org.test.common;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Employee> getEmployeeDetails() {

        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee(201, "kolanji", "IT", 60000,"A"));
        employeeList.add(new Employee(202, "anjalai", "EB", 70000,"A"));
        employeeList.add(new Employee(203, "agilan", "Admin", 80000,"A"));
        employeeList.add(new Employee(204, "Priyadharshini", "account", 90000,"A"));
        employeeList.add(new Employee(205, "Kuppuswamy", "Network", 100000,"A"));
        return employeeList;
    }

}
