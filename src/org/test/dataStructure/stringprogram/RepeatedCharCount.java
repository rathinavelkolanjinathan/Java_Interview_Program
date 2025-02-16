package org.test.dataStructure.stringprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedCharCount {
    public static void main(String[] args) {
        String word = "indiiaaii";
        repeatCharacterCount(word);
    }

    public static void repeatCharacterCount(String word) {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = word.toCharArray();
        for (Character c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //System.out.println(map);
        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }
}