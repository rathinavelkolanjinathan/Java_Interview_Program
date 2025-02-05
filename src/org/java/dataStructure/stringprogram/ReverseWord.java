package org.java.dataStructure.stringprogram;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWord {
    public static void main(String[] args) {
// Time complexity is to high and memory space also taking to much
        String inputStr = "Hello Java";
        Stack stack = new Stack();
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(inputStr, "  ");
        while (stringTokenizer.hasMoreTokens()) {

            stack.push(stringTokenizer.nextToken());
        }
        while (!stack.isEmpty()) {

            stringBuilder.append(stack.pop());

        }
        System.out.println("Using string builder ::" + stringBuilder.toString());

        //Using Jdk8
        String String = Stream.of(inputStr)
                .map(inputValues ->
                        new StringBuilder(inputValues)
                        .reverse())
                .collect(Collectors.joining());
        System.out.println("Using jdk8 :: " + String);

    }
}
