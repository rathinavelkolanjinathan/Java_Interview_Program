package org.java.CoreJava.JDK8.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

// Ex:- If we are read the csv file if we don't want header part of csv files then time we can use skip
public class SkipAndLimit {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        numbers.stream()
                .skip(2)
                .limit(7)
                .forEach(System.out::print);

        System.out.println("\n"+"======================================");

        List<String> fileData = Files.readAllLines(Paths.get("SkipAndLimit.txt"));

        //System.out.println(fileData.size());
        fileData.stream()
                .skip(1)
                .limit(fileData.size()-2)
                .forEach(System.out::println);

    }

}
