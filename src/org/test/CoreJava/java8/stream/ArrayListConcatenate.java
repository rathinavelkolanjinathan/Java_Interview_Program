package org.test.CoreJava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListConcatenate {
    public static void main(String[] args) {


        List<String> list = new ArrayList();
        list.add("ram");
        list.add("rathna");
        list.add("naresh");
        list.add("sam");
        list.add("ajay");

        Stream s = list.stream();

        List<Integer> l = new ArrayList();
        l.add(5);
        l.add(5);
        l.add(4);
        l.add(4);
        l.add(5);
        l.add(3);
        l.add(3);
        Stream<Integer> ss = l.stream();
        Stream st = Stream.concat(s, ss);
        st.forEach((x) -> System.out.println(x));

        //Optional<Integer> o=s.reduce((x,y)->{return x+y;});
    }
}
