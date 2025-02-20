package org.test.coreJavaprogram.java8.flatmapVSmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        System.out.println("list size" + list.size());
        list.add("corejava advancedjava orcle");
        list.add("NIIT KANPUR");
        list.add("iit chennai");
        list.add("values  chennai");


        Stream<String> s = list.stream().flatMap((String x) -> {
            String[] value = x.split(" ");
            return Arrays.asList(value).stream();

        });

        // System.out.println(val.count());
        //List<String> li1 = val.collect(Collectors.toList());
        s.forEach((x) -> {
            System.out.println(x + "...." + x.length());
        });
    }

    /*
     * List < String > words = Arrays.asList("JavaDevJournal", "Java"); List <
     * String > unique = words.stream() .map(s -> s.split(""))
     * .flatMap(Arrays::stream) .distinct() .collect(Collectors.toList());
     */
    //System.out.println(unique);

}
