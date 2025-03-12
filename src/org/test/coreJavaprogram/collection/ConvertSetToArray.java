package org.test.coreJavaprogram.collection;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertSetToArray {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("kolanji");
        hashSet.add("rathna");

        // 1.convert Set To Array
        String[] st = new String[hashSet.size()];
        hashSet.toArray(st);
        System.out.println("HashSet after convert Array.........." + Arrays.toString(st));

        //2. convert Set To ArrayList
        List<String> ll = hashSet.stream().collect(Collectors.toList());
        System.out.println("TreeSet After Convert List.............." + ll);

        //3.TreeSet To Array
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        String[] value = new String[treeSet.size()];
        treeSet.toArray(value);
        System.out.println("TreeSet After Convert Array.........." + Arrays.toString(value));


        //convert List to Map
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");

        // Convert to map: Key is the string, value is the length of the string
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(
                        item -> item,           // Key mapper
                        item -> item.length()   // Value mapper
                ));
    }
}
