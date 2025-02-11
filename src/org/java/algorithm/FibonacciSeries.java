package org.java.algorithm;

import java.util.logging.Logger;

public class FibonacciSeries {

    private static final Logger logger = Logger.getLogger(FibonacciSeries.class.toString());

    /**
     * This method is used to generate the nth fibonacci number
     *
     * @param n n
     * @return a nth fibonacci number
     */
    public static int fib(int n) {
        logger.info("input values: " + n);
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //scanner.close();
        logger.info("fibonacci::" + fib(5));
    }
}
