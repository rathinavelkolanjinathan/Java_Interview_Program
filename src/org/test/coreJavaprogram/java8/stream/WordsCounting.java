package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCounting {
    public static void main(String[] args) {

        String str = "welcome welcome to code decode";

        //methods2
        Map<String, Long> countWord =
                Arrays.stream(str.split(" "))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("CountWord Method2" + countWord);



    }
}
