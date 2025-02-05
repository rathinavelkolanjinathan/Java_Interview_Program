package org.java.algorithm;

import java.util.logging.Logger;

public class Factorial {
    private static final Logger logger = Logger.getLogger(Factorial.class.toString());

    public static void main(String[] args) {
        int nn = 5;
        int result = factorial(nn);

        logger.info("Factorials of " + nn + "= " + result);
    }

    static int factorial(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;

        } else {
            return n * factorial(n - 1);
        }
    }
}
