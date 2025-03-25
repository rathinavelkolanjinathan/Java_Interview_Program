package org.java.CoreJava.JDK8.stream.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        List ll = list.stream().
                filter((x) -> x % 2 == 0)
                .map((x) -> x * x)
                .collect(Collectors.toList());
        System.out.println(ll);

    }
}
