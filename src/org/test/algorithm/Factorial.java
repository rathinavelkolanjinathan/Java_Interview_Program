package org.test.algorithm;

import java.util.logging.Logger;

public class Factorial {
    private static final Logger logger = Logger.getLogger(Factorial.class.toString());

    public static void main(String[] args) {
        int factNum = 5;
        int result = factorial(factNum);

        logger.info("Factorials of " + factNum + "= " + result);
    }

    static int factorial(int factNum) {
        if (factNum < 0) {
            return -1;
        } else if (factNum == 0) {
            return 1;

        } else {
            return factNum * factorial(factNum - 1);
        }
    }
}
