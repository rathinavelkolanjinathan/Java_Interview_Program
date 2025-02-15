package org.java.algorithm;

public class isNumber {

    public static boolean checkIsNumber(String str) {
        try {
            int length = str.length();
            if (str.equals("Infinity") || str.equals("-Infinity") ||
                    str.equals("+Infinity") || str.charAt(length - 1) == 'f' ||
                    str.charAt(length - 1) == 'd' || str.charAt(length - 1) == 'D' ||
                    str.charAt(length - 1) == 'F')
                return false;
            return true;
        } catch (Exception e) {
            return false;
        }


    }

    public static void main(String[] args) {
        boolean isNumb = checkIsNumber("1254---");
        System.out.println(isNumb);
    }
}
