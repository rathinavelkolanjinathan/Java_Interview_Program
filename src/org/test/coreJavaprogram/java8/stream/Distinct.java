package org.test.coreJavaprogram.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(3);

        Stream<Integer> stream = list.stream();

		stream.distinct()
				.forEach(a -> System.out.println("Distinct"+a));

        /*
         * Stream<Integer>ss=s.distinct();
         *
         * Object[] obj=ss.toArray(); for(Object o:obj) {
         *
         * System.out.println(o); }
         */
        /*
         * Stream<Integer>limit=s.limit(3); Object[] ob=limit.toArray(); for(Object
         * o:ob) {
         *
         * System.out.println(o); }
         */


        long finalVal = list.stream()
                .distinct()
                .limit(4)
                .peek((x) -> {
                    System.out.println(x * x);
                })
                .count();
        System.out.println(finalVal);

    }

}
