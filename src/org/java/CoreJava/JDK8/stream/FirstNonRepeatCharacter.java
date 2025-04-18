package org.java.CoreJava.JDK8.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatCharacter {
    public static void main(String[] args) {
        String str = "koollaanji";

        // approach-1
       String firstNonRepeat = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x ->x.getValue()==1)
                .findFirst()
                .get()
                .getKey();


       System.out.println("First Non-Repeated Character..... "+firstNonRepeat);

       //First Repeat character  approach 2
        String firstRepeat = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,
                        Collectors.counting()))
                       .entrySet()
                       .stream()
                       .filter(x ->x.getValue()>1)
                       .findFirst()
                       .get()
                       .getKey();
        System.out.println("First Repeated Character...... "+ firstRepeat);
    }
}
