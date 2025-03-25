package org.java.CoreJava.JDK8.stream;

import org.java.commons.Database;
import org.java.commons.Employee;
import java.util.Map;
import java.util.stream.Collectors;
public class ConvertListToMap {
    public static void main(String[] args) {
        // convert List to Map values
        Map<Integer, String> empMap =
                Database.getEmployeeDetails()
                        .stream()
                        .collect(Collectors.toMap(Employee::getId, Employee::getName));
                          System.out.println("Employee Values..." + empMap);

    }
}
