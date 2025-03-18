package org.test.CoreJava.JDK8.stream;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumberArray {

    public static void main(String[] args) {



        int[] number = {5, 9, 11, 2, 8, 21, 11};
        //Second Highest
        Integer secondHighest =
                Arrays.stream(number)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .get();  //collect(Collectors.toList());
        System.out.println("Second Highest..." + secondHighest);

        //Second lowest

          Integer secondLowest = Arrays.stream(number)
                  .boxed()
                  .sorted()
                  .skip(1)
                  .findFirst()
                  .get();
        System.out.println("Second Lowest..." + secondLowest);

    }
}
