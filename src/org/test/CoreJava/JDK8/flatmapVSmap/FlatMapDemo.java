package org.test.CoreJava.JDK8.flatmapVSmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        //System.out.println("list size" + list.size());
        list.add("CoreJava AdvancedJava Oracle");
        list.add("NIIT KANPUR");
        list.add("iit chennai");
        list.add("values  chennai");

        Stream<String> stream = list.stream().flatMap((String str) -> {
            String[] value = str.split(" ");
            return Arrays.asList(value).stream();

        });


        stream.forEach((x) -> {
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
