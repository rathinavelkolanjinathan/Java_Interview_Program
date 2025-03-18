package org.test.dataStructure.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.logging.Logger;

public class Print2DArray {
    private static final Logger logger = Logger.getLogger(Print2DArray.class.toString());

    public static void main(String[] args) {

        //System.out.println("test"+1.0/0.0);
        String[][] names = {{"Sam", "Smith"},
                {"Robert", "Delgro"},
                {"James", "Gosling"},
        };

        Arrays.stream(names).map(arr -> String.join(" ", arr))
                .forEach(System.out::println);

        // string
        Arrays.stream(names).forEach((i) -> {
            Arrays.stream(i).forEach((j) -> logger.info(j + " "));
            System.out.println();
        });

        int[][] maxArray = {{4, 5, 6},
                {2, 5, 6, 8, 9},
                {5, 8, 4, 10},

        };
        Arrays.stream(maxArray).map(a -> a)
                .forEach(System.out::println);
        //integer
        Arrays.stream(maxArray).forEach((i) -> {
            Arrays.stream(i)
                    .forEach((j) -> logger.info(j + " "));
            System.out.println();
        });

        //row wise max values
        Arrays.stream(maxArray).map(ints -> Arrays
                        .stream(ints)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .skip(2)
                        .findFirst())
                .forEach(System.out::println);

    }


}
