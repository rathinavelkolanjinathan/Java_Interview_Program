package org.java.dataStructure.stringprogram;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseLetter {
    public static void main(String[] args) {
      //Wthout jdk8
        String str = "Hello Java";
        String[] splits = str.split(" ");


        //StringJoiner is used to construct a sequence of characters separated
        // by a delimiter and optionally starting with
        // a supplied prefix and ending with a supplied suffix.
        StringJoiner stringJoiner = new StringJoiner(" ");

        for (String split : splits) {
            stringJoiner.add(new StringBuilder(split)
                    .reverse()
                    .toString());
        }

        System.out.println("Using string builder ::" + stringJoiner.toString());

        //Using Jdk8
        String String = Stream.of(str)
                .map(values ->
                        new StringBuilder(values)
                                .reverse())
                .collect(Collectors.joining());
        System.out.println("Using jdk8 :: " + String);

    }
}
