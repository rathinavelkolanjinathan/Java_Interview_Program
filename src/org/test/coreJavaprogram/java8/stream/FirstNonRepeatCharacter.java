package org.java.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String str = "koollaanji";

       String firstNonRepeat = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x ->x.getValue()==1)
                .findFirst()
                .get()
                .getKey();

       System.out.println("First Non-Repeated Character :: "+firstNonRepeat);

       //First Repeat character

           String firstRepeat =    Arrays.stream(str.split(""))
                                  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
                                   Collectors.counting()))
                       .entrySet()
                       .stream()
                       .filter(x ->x.getValue()>1)
                       .findFirst()
                       .get()
                       .getKey();
        System.out.println("First Repeated Character:: "+ firstRepeat);
    }
}
