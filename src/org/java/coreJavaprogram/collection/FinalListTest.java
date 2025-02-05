package org.java.coreJavaprogram.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FinalListTest {
    private static final Logger logger = Logger.getLogger(FinalListTest.class.toString());

    public static void main(String[] args) {
        final List list = new ArrayList();
        list.add("1");
        list.add("2");

        list.add("3");
        logger.info("Size of array" + list.size());
    }
}
