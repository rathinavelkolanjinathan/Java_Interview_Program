package org.java.dataStructure.stringprogram;

public class ValueCompare {
    public static void main(String[] args) {
        String s1 = "kolanji";
        String s2 = new String("kolanji");
        String s3 = "kolanji";
        String s4 = new String("kolanji");

        if (s1 == s2) {
            System.out.println("s1 and s2 equals");
        }
        if (s2 == s4) {
            System.out.println("s2 and  s4 equals");
        }
        if (s1 == s3) {
            System.out.println("s1 and s3 equals");
        }
        if (s3 == s2) {
            System.out.println("s3 and  s2 equals");
        }
    }
}
