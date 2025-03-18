package org.test.CoreJava.JDK8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PeekTest {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(5);
        l.add(5);
        l.add(4);
        l.add(4);
        l.add(5);
        l.add(3);
        l.add(3);
        Stream<Integer> s = l.stream();
        Stream<Integer> pee = s.peek((x) -> {
            System.out.println(x * x);
        });
        System.out.println(pee.count());

    }
}
