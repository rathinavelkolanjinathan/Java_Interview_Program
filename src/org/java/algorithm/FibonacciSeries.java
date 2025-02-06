package org.java.algorithm;

import java.util.logging.Logger;

public class FibonacciSeries {
    /**
     * This method is used to generate the nth fibonacci number
     *
     * @param int n
     * @return a nth fibonacci number
     */

    private static final Logger logger = Logger.getLogger(FibonacciSeries.class.toString());

    public static int fib(int n) {
        //System.out.println("input values: "+n);
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    /**
     * Unit tests the {@code FibonacciNumber}
     *
     * @param args
     */
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //scanner.close();
        logger.info("fibonacci::" + fib(5));
    }
}
