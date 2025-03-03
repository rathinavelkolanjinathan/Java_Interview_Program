package org.test.algorithm;

import java.util.logging.Logger;

public class Factorial {
    private static final Logger logger = Logger.getLogger(Factorial.class.toString());

    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);

        logger.info("Factorials of " + num + "= " + result);
    }

    static int factorial(int num) {
        if (num < 0) {
            return -1;
        } else if (num == 0) {
            return 1;

        } else {
            return num * factorial(num - 1);
        }
    }
}
