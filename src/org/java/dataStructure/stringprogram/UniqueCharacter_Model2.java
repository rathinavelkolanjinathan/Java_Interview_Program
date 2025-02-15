package org.java.dataStructure.stringprogram;

import org.java.dataStructure.arrayprogram.MinimumValuesArray;

import java.util.logging.Logger;

public class UniqueCharacter_Model2 {
    private static final Logger logger = Logger.getLogger(UniqueCharacter_Model2.class.toString());

    public static void main(String args[]) {
        UniqueCharacter_Model2 obj = new UniqueCharacter_Model2();
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
