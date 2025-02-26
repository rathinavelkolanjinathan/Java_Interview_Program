package org.test.common;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<Employee> getEmployeeDetails() {

        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee(201, "kolanji", "IT", 600,"A"));
        employeeList.add(new Employee(202, "anjalai", "EB", 700,"A"));
        employeeList.add(new Employee(203, "agilan", "Admin", 800,"A"));
        employeeList.add(new Employee(204, "Priyadharshini", "account", 900,"A"));
        employeeList.add(new Employee(205, "Kuppuswamy", "Network", 1000,"A"));
        return employeeList;
    }

}
