package org.test.dataStructure.stringprogram;

public class EqualsTest {

    public static void main(String[] args) {
        String blogName = "HowToDoInJava.com";

        String anotherString = new String("HowToDoInJava.com");

        System.out.println(blogName == anotherString);     //false

        System.out.println(blogName.equals(anotherString));
    }
}
