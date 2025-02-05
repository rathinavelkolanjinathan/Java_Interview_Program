package org.java.algorithm;

import java.util.logging.Logger;

public class StringUniqueCharacter_Model2 {
    private static final Logger logger = Logger.getLogger(MinimumValuesArray.class.toString());

    public static void main(String args[]) {
        StringUniqueCharacter_Model2 obj = new StringUniqueCharacter_Model2();
        String input = "GeeksforGeeks";

        if (obj.uniqueCharacters(input))
            logger.info("The String " + input + " has all unique characters");
        else
            logger.info("The String " + input + " has duplicate characters");
    }

    boolean uniqueCharacters(String str) {
        // If at any time we encounter 2 same
        // characters, return false
        for (int i = 0; i < str.length(); i++)
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(i) == str.charAt(j))
                    return false;

        // If no duplicate characters encountered,
        // return true
        return true;
    }
}
