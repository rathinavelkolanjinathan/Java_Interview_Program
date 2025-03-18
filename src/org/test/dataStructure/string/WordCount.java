package org.test.dataStructure.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList();
        //System.out.println("list size"+list.size());
        wordList.add("CoreJava Oracle");
        wordList.add("Niit Kanpur");
        wordList.add("iit delhi");
        wordList.add("Mit chennai");

        Stream<String> streamVal = wordList.stream()
                .flatMap((String str) -> {
                    String[] value = str.split(" ");
                    return Arrays.asList(value).stream();

                });

        streamVal.forEach((result) -> {
            System.out.println(result + " <--------> " + result.length());
        });
    }
}
