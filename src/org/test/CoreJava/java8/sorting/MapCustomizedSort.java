package org.test.CoreJava.java8.sorting;

import org.test.common.Employee;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapCustomizedSort {
    public static void main(String[] args) {
        Map<Employee, Integer> empMap =
                new TreeMap<>((emp1, emp2) -> (int) (emp1.getSalary() - emp2.getSalary()));
        empMap.put(new Employee(201, "kolanji", "IT", 60000,"A"), 60);
        empMap.put(new Employee(202, "anjalai", "EB", 70000,"A"), 90);
        empMap.put(new Employee(203, "amirthalingam", "Admin", 80000,"A"), 80);
        empMap.put(new Employee(204, "Priyadharshini", "account", 90000,"A"), 90);
        empMap.put(new Employee(205, "Kuppuswamy", "Network", 100000,"A"), 100);

        //List<Entry<String,Integer>> entries = new ArrayList(map.entrySet());
        // System.out.println("After entry set"+entries);
        // Collections.sort(entries,(emp1,emp2)->emp1.getKey().compareTo(emp2.getKey()));

        //Stream Expression filter by salary
        empMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)
                        .reversed()))
                .forEach(System.out::println);

// filter based by dept
        empMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept)
                        .reversed()))
                .forEach(System.out::println);

        /*empMap.entrySet().
                stream().
                sorted(Map.Entry.
                        comparingByValue(Comparator.comparing(Employee::getName)
                                .reversed())).forEach(System.out.println());*/


    }
}
