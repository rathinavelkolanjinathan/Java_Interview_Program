package org.test.CoreJava.java8.stream;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryDemo {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("bhavna", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1500);//output
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1300);


        Map.Entry<String, Integer> highestSalary = getNthHighestSalary(3, map1);
        //System.out.println(3+"highestSalary ..... "+highestSalary);


        System.out.println(getDynamicNthHighestSalary(3, map1));


    }

    /**
     * This method give single record only if list have more record as same conditions
     * @param num
     * @param map
     * @return
     */
    public static Map.Entry<String, Integer>
    getNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num - 1);
    }

    /**
     * This method give all record if list have more record in same conditions .
     * @param num
     * @param map
     * @return
     */
    public static Map.Entry<Integer, List<String>>
    getDynamicNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList())
                .get(num - 1);
    }
}
