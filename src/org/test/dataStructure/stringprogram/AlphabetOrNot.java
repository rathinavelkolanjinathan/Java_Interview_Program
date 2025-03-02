package org.test.dataStructure.stringprogram;

public class AlphabetOrNot {

    public static void main(String[] args) {
        System.out.println(checkAllChars("qwertyuioplkjhgfdsAzxcvbnm"));
        System.out.println(checkAllChars("123"));
        System.out.println(checkAllChars("ejuxggfsts"));
        System.out.println(checkAllChars("ABC"));
    }

    public static String checkAllChars(String value) {

        if (value.length() < 26) {

            return "false";
        }

        String isAlphabet = "";
        for (int i = 0; i < value.length(); i++) {

            char c = value.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                isAlphabet = "TRUE";
                System.out.print(c + " is an alphabet.");
            } else {
                System.out.print(c + " is not an alphabet.");
                isAlphabet = "false";
            }


        }
        return isAlphabet;
    }
}
