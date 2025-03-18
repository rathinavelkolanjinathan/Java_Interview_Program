package org.test.CoreJava.JDK8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListWithSquareRoot {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        List ll = l.stream().map((x) -> (x * 5)).collect(Collectors.toList());

        ll.forEach((x) -> {
            System.out.println(x);
        });

    }
}
