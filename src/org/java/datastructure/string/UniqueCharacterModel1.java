package org.java.datastructure.string;

import java.util.logging.Logger;

public class UniqueCharacterModel1 {
    private static final Logger logger = Logger.getLogger(UniqueCharacterModel1.class.toString());

    public static void main(String[] args) {
        String uniqueVal = "Hellohhhh";
        boolean  uniqueChar = UniqueCharacterModel1.uniqueChar(uniqueVal);
        logger.info("boolean " + uniqueChar);
    }

    public static boolean uniqueChar(String uniqueVal) {
        if (uniqueVal.length() > 128) {
            return false;
        }
        boolean[] charSet = new boolean[128];
        for (int i = 0; i < uniqueVal.length(); i++) {
            int val = uniqueVal.charAt(i);
            logger.info("values " + val);
            if (charSet[val]) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
