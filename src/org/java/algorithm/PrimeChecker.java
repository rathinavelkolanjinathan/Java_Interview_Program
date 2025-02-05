package org.java.algorithm;

import java.util.logging.Logger;

import static java.lang.Math.sqrt;

/**
 * time complexity  o(n)
 */
public class PrimeChecker {
    private static final Logger logger = Logger.getLogger(PrimeChecker.class.toString());

    public static boolean isPrime(int n) {
        //prime number 2,3,5,7,11....97
        for (int i = 2; i < sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean checkPrime = PrimeChecker.isPrime(10);
        logger.info("Prime number{}:" + checkPrime);
    }

}
