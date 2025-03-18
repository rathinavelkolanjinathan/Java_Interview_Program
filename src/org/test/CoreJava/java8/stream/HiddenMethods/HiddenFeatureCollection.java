package org.test.CoreJava.java8.stream.HiddenMethods;

import java.util.*;
import java.util.stream.Collectors;

public class HiddenFeatureCollection {
    public static void main(String[] args) {
        //ncopies
        List<String> copies = Collections.nCopies(5, "JavaTechie");
        System.out.print("copies" + copies);
        try {
            copies.set(0, "Youtube");
        } catch (UnsupportedOperationException ex) {
            System.out.println("List is immutable ,it cant be modify");
        }

        //frequency
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5);
        long count = Collections.frequency(num, 6);
        System.out.println("6 present" + count);

        //count each element present
        Map<Integer, Integer> map = num
                .stream()
                .collect(Collectors.toMap(number -> number, number ->
                                Collections.frequency(num, number),
                        (existingvalue, newValue) -> existingvalue));
        System.out.print("map" + map);

        //rotate
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            list.add(i);
        }
        System.out.println("List" + list);
        Collections.rotate(list, 3);
        System.out.println("rotate" + list);
        Collections.rotate(list, -4);
        System.out.println("rotate left" + list);
    }
}
