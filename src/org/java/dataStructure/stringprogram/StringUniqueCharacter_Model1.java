package org.java.dataStructure.stringprogram;

import org.java.dataStructure.arrayprogram.MinimumValuesArray;

import java.util.logging.Logger;

public class StringUniqueCharacter_Model1 {
    private static final Logger logger = Logger.getLogger(MinimumValuesArray.class.toString());

    public static void main(String[] args) {
        String uniqueVal = "Hellohhhh";
        boolean b = StringUniqueCharacter_Model1.uniqueChar(uniqueVal);
        logger.info("boolean " + b);
    }

    public static boolean uniqueChar(String uniqueVal) {
        if (uniqueVal.length() > 128) {
            return false;
        }
        boolean[] char_Set = new boolean[128];
        for (int i = 0; i < uniqueVal.length(); i++) {
            int val = uniqueVal.charAt(i);
            logger.info("values " + val);
            if (char_Set[val]) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
