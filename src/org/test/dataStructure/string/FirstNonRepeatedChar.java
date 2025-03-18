package org.test.dataStructure.string;

import java.util.*;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String input = "kolaanji".toLowerCase();
        char ch = FirstNonRepeatedChar.getFirstNonRepeatedChar(input);
        System.out.println("values " + ch);

    }
    /* * Using LinkedHashMap to find first non repeated character of String *
     * Algorithm : * Step 1: get character array and loop through it to build a
     * * hash table with char and their count.
     * * Step 2: loop through LinkedHashMap to find an entry with
     * * value 1, that's your first non-repeated character,
     * * as LinkedHashMap maintains insertion order. */

    public static char getFirstNonRepeatedChar(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
        for (char c : str.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }

        for (Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("didn't find any non repeated Character");
    }
}
