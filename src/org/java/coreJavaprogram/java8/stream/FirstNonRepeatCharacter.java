package org.java.coreJavaprogram.java8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String nonRepeat = "koollaanji";

       String firstNonRepeat = Arrays.stream(nonRepeat.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x ->x.getValue()==1)
                .findFirst()
                .get()
                .getKey();

       System.out.println("First NonRepeatChar:: "+firstNonRepeat);

       //First Repeat character

           String firstRepeat =    Arrays.stream(nonRepeat.split(""))
                                  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
                                   Collectors.counting()))
                       .entrySet()
                       .stream()
                       .filter(x ->x.getValue()>1)
                       .findFirst()
                       .get()
                       .getKey();
        System.out.println("FirstRepeatChar:: "+ firstRepeat);
    }
}
