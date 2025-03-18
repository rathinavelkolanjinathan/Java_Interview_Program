package org.test.dataStructure.string;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseLetter {
    public static void main(String[] args) {
      //Wthout jdk8
        String str = "Hello Java";
        String reverse ="";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }

        System.out.println("Reverse..... "+reverse);


        //StringJoiner is used to construct a sequence of characters separated
        // by a delimiter and optionally starting with
        // a supplied prefix and ending with a supplied suffix.
        StringJoiner stringJoiner = new StringJoiner(" ");
        String[] splits = str.split(" ");
        for (String str1 : splits) {
            stringJoiner.add(new StringBuilder(str1)
                    .reverse()
                    .toString());
        }
        System.out.println("Using stringDemo Builder....." + stringJoiner);

        //Using Jdk8
        String String = Stream.of(str)
                .map(values ->
                        new StringBuilder(values)
                                .reverse())
                .collect(Collectors.joining());
        System.out.println("Using jdk8...... " + String);

    }
}
