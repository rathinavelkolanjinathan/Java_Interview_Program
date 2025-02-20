package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingWords {
    public static void main(String[] args) {

        String str = "welcome welcome to code decode";

        //Methods1
        List<String> list = Arrays.asList(str.split(" "));
        Map<String, Long> countWord1 = list.stream()
                .collect(Collectors.groupingBy(Function.identity()
                        , Collectors.counting()));

        System.out.println("CountWord Method1" + countWord1);

        //methods2
        Map<String, Long> countWord =
                Arrays.stream(str.split(" "))
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("CountWord Method2" + countWord);


    }
}
