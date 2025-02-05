package org.collection;

import org.algorithm.Factorial;

import java.util.EnumSet;
import java.util.logging.Logger;

public class GFG {
    private static final Logger logger = Logger.getLogger(GFG.class.toString());
    // Enum
    enum Game { CRICKET, HOCKEY, TENNIS }

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an EnumSet using allOf()
        EnumSet<Game> games = EnumSet.allOf(Game.class);

        // Printing EnumSet elements to the console
        logger.info("EnumSet: " + games);
    }
}
