package org.java.leetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 * <p>
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 * <p>
 * Input: s = "aabb"
 * Output: -1
 */
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String st = "";
        firstUniqueChar(st);

    }

    public static int firstUniqueChar(String str) {
        int index = -1;
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int freq = map.getOrDefault(c, 0);
            map.put(c, (freq + 1));
        }
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}
