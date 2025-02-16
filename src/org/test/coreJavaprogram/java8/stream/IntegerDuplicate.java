package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntegerDuplicate {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet();
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 12, 12, 36);
        list.stream()
                .filter(num -> !set.add(num))
                .collect(Collectors.toSet())
                .forEach(result -> System.out.println("Duplicate values::"+result));
    }

}
