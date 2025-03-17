package org.test.coreJavaprogram.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyCollection {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 5, 7, 4, 3, 6, 1);
        long count = Collections.frequency(num, 6);
        System.out.println("6 Presents " + count+" time in a given list");

        // find out the occurence of each elemnt
     /* Map<Integer,Integer> count1= num.stream()
              .collect(Collectors.toMap(numbers->num, numbers->
                      Collections.frequency(num,numbers),
                      (existingvalue, newvalue)->existingvalue));*/
    }
}
