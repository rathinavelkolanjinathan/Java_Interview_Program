package org.java.coreJavaprogram.java8.fucntionalinterface.Streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        l.add(30);
        l.add(35);
        List ll =  l.stream().
                filter((x) -> x % 2 == 0)
                .map((x) -> x * x)
                .collect(Collectors.toList());
        System.out.println(ll);

    }
}
