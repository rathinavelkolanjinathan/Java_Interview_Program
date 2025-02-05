package org.collection.generics;

import org.algorithm.Factorial;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class UnboundedWildcard {
    private static final Logger logger = Logger.getLogger(UnboundedWildcard.class.toString());
    public static void main(String[] args)
    {

        // Integer List
        List<Integer> list1 = Arrays.asList(1, 2, 3);

        // Double list
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);

        printListValues(list1);

        printListValues(list2);
    }

    private static void printListValues(List<?> list)
    {

        logger.info("list of values"+list);
    }
}
