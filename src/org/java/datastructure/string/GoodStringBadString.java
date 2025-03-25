package org.java.datastructure.string;


import java.util.logging.Logger;

public class GoodStringBadString {
    private static final Logger logger = Logger.getLogger(GoodStringBadString.class.toString());

    public static void main(String[] args) {

        String bad = "good baad jaava schooool objeect";

        String goodString = bad
                .replaceAll("(?i)(\\p{L})\\1", "$1");
        logger.info("Result " + goodString);
    }
}
