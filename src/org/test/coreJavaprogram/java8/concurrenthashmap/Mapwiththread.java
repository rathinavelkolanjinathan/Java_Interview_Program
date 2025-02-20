package org.test.coreJavaprogram.java8.concurrenthashmap;

import java.util.HashMap;
import java.util.Map;

public class Mapwiththread extends Thread {
    static Map<Integer, String> map = new HashMap();

    public void run() {
        try {
            Thread.sleep(1000);
            map.put(103, "D");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put(100, "A");
        map.put(101, "b");
        Mapwiththread thread = new Mapwiththread();
        thread.start();
        for (Object object : map.entrySet()) {
            Object s = object;
            System.out.println(" Object values " + s);
            Thread.sleep(1000);
        }
        System.out.println("Map values " + map);
    }
}
