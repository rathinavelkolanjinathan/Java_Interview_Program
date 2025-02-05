package org.collection.generics;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class LowerBounded {
    private static final Logger logger = Logger.getLogger(LowerBounded.class.toString());
    public static void main(String[] args)
    {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);

        // Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }

    public static void printOnlyIntegerClassorSuperClass(
            List<? super Integer> list)
    {
        logger.info("List of values:{}"+list);
    }
}
