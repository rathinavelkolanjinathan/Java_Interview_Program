package org.test.dataStructure.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {
    public static void main(String[] args) {
        String st[] = {"{30,40}\n{70,80}\n{50,60}"};
        String result = "";
        String[] array = new String[st.length];
        for (String ss : st) {
            result = ss.replaceAll("\\s", "");
            ss.replaceAll("[^a-zA-Z0-9]", " ");
            array = result.split(",");
        }
        //System.out.println(array.toString());

        List<String> st1 = Arrays.asList(result).stream().sorted().collect(Collectors.toList());

        System.out.println(st1);
    }
}
