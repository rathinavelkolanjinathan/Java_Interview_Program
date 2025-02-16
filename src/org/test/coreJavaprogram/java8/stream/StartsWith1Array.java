package org.test.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith1Array {
    public static void main(String[] args) {
        int [] number = {5,9,11,2,8,21,1};

      List<String> startOne =  Arrays.stream(number)
                .boxed()
                .map(s -> s+ "")
                .filter(x -> x.startsWith("1"))
                .collect(Collectors.toList());

      System.out.println("startOne "+startOne);
    }
}
