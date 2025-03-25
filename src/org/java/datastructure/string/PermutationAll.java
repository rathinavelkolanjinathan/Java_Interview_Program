package org.java.datastructure.string;

public class PermutationAll {
    public static void main(String[] args) {
        String per = "123";
        permutation(per, "");
    }

    public static void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println("Prefix......." + prefix);
        }
        for (int i = 0; i < str.length(); i++) {

            String rem = str.substring(0, i) + str.substring(i + 1);
            permutation(rem, prefix + str.charAt(i));
        }

    }
}
