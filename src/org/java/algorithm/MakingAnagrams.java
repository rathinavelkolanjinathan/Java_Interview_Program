package org.java.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MakingAnagrams {
    private static final Logger logger = Logger.getLogger(MakingAnagrams.class.toString());

    public static void isAnagram(String firstString, String secondString) {

         //Remove all white space & case differences
        String strCopyOne = firstString.replaceAll("\\s", "").toUpperCase();
        String strCopyTwo = secondString.replaceAll("\\s", "").toUpperCase();

        //If the strings aren’t the same length, not anagrams
        if (strCopyOne.length() != strCopyTwo.length()) {
            logger.info("Input string are not anagrams");
            return;
        }

        //HashMap to store the number of characters
        Map<Character,Integer> mapOne = createMapKeys(strCopyOne);
        Map<Character,Integer> mapTwo = createMapKeys(strCopyTwo);
        if (mapOne.equals(mapTwo)) {
            logger.info("Input string are anagrams");
        } else {
            logger.info("Input string are not anagrams.");
        }
    }

    public static Map<Character,Integer> createMapKeys(String str) {
        HashMap<Character,Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                int count =  map.get(str.charAt(i));
                map.put(str.charAt(i), count + 1);
            } else {
                map.put(str.charAt(i), 0);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // String a = in.next();
        // String b = in.next();
        isAnagram("nowww", "own");
        //System.out.println();
        // in.close();
    }
}
