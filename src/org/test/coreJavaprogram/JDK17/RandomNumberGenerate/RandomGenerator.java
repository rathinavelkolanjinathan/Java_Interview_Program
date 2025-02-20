package org.test.coreJavaprogram.JDK17.RandomNumberGenerate;

import java.util.SplittableRandom;

public class RandomGenerator {
    //This feature provides additional pseudo-random number generators (PRNGs)
    // that can be used to generate random numbers in Java applications
    public static void main(String[] args) {

        SplittableRandom random = new SplittableRandom();
        int randomNumber = random.nextInt();
        System.out.println("randomNumber>>>>>>" +randomNumber);

        //range
        SplittableRandom random1 = new SplittableRandom();
        int randomNumberInRange = random1.nextInt(10, 20);
        System.out.println("Range>>>>" +randomNumberInRange);
        //split
        SplittableRandom random2 = new SplittableRandom();
        SplittableRandom random3 = random1.split();
        System.out.println("Split>>>" +random2.toString());
    }
}
