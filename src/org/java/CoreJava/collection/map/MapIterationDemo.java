package org.java.CoreJava.collection.map;

import java.util.*;
import java.util.logging.Logger;

/*
 * This class testing for java collections map values
 */
public class MapIterationDemo {
    private static final Logger logger = Logger.getLogger(MapIterationDemo.class.toString());

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "kolanji");
        map.put("2", "rathna");
        map.put("3", "velmurugan");
        // Only Key Fetch
        for (Object k : map.keySet()) {

            logger.info("K vlaues " + k);
        }

        Iterator i = map.entrySet().iterator();
        while (i.hasNext()) {
        }

        //

        // i variable we cant insert as a key in map
    }

}
