package org.test.algorithm;

import java.util.logging.Logger;

public class FibonacciSeries {

    private static final Logger logger = Logger.getLogger(FibonacciSeries.class.toString());

    /**
     * This method is used to generate the nth fibonacci number
     *
     * @param num num
     * @return a nth fibonacci number
     */
    public static int fib(int num) {
       // logger.info("input values: " + num);
        if (num <= 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        }

        return fib(num - 1) + fib(num - 2);
    }


    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        //scanner.close();

        int fibonacci = FibonacciSeries.fib(5);
        logger.info("Fibonacci..." + fibonacci);
    }
}
