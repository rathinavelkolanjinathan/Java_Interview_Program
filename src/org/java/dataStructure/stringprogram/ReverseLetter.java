package org.java.dataStructure.stringprogram;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseLetter {
    public static void main(String[] args) {

        String inputStr = "Hello Java";
        String[] splits = inputStr.split(" ");
        //StringJoiner is used to construct a sequence of characters separated
        // by a delimiter and optionally starting with
        // a supplied prefix and ending with a supplied suffix.
        StringJoiner outputString = new StringJoiner(" ");

        for (String split : splits) {
            outputString.add(new StringBuilder(split)
                    .reverse()
                    .toString());
        }

        System.out.println("Using string builder ::" + outputString.toString());

        //Using Jdk8
        String String = Stream.of(inputStr)
                .map(inputValues ->
                        new StringBuilder(inputValues)
                                .reverse())
                .collect(Collectors.joining());
        System.out.println("Using jdk8 :: " + String);

    }
}
