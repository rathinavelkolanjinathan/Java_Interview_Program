package org.java.coreJavaprogram.java8.stream;

import org.java.common.Database;
import org.java.common.Employee;
import java.util.Map;
import java.util.stream.Collectors;
public class ConvertListToMap {
    public static void main(String[] args) {
        // convert List to Map values
        Map<Integer, String> empMap =
                Database.getEmployeeDetails()
                        .stream()
                        .collect(Collectors.toMap(Employee::getId, Employee::getName));
                          System.out.println("Employee Values::" + empMap);

    }
}
