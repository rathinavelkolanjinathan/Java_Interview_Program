package org.java.CoreJava.collection.map;

import java.util.HashMap;
import java.util.logging.Logger;

public class HashMapGoodCustomKey {
    private static final Logger logger = Logger.getLogger(HashMapGoodCustomKey.class.toString());

    public static void main(String[] args) {


        //Create a HashMap with mutable key
        HashMap<Account, String> map = new HashMap<Account, String>();

        //Create key 1
        Account a1 = new Account(1);
        a1.setHolderName("A_ONE");
        //Create key 2
        Account a2 = new Account(2);
        a2.setHolderName("A_TWO");

        //Put mutable key and value in map
        map.put(a1, a1.getHolderName());
        map.put(a2, a2.getHolderName());

        //Change the keys state so hash map should be calculated again
        a1.setHolderName("Defaulter");
        a2.setHolderName("Bankrupt");

        //Success !! We are able to get back the values
        logger.info(map.get(a1)); //Prints A_ONE
        logger.info(map.get(a2)); //Prints A_TWO

        //Try with newly created key with same account number
        Account a3 = new Account(1);
        a3.setHolderName("A_THREE");

        //Success !! We are still able to get back the value for account number 1
        logger.info(map.get(a3)); //Prints A_ONE
    }
}
