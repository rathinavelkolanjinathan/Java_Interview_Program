package org.test.CoreJava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class FindAny {
    public static void main(String[] args) {
        List<String> l = new ArrayList();
        l.add("Java");
        l.add("oracle");
        l.add("value");
        l.add("c");
        l.add("xml");

        Stream<String> ll = l.stream();
        // Optional<String> o=ll.findFirst();
        Optional<String> o = ll.findAny();
        System.out.println(o.get());

    }

}
