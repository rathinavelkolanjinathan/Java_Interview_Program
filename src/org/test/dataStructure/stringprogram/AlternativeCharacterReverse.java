package org.test.dataStructure.stringprogram;

public class AlternativeCharacterReverse {
    public static void main(String[] args) throws java.lang.Exception {

        String st = "kolanji";

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (i % 2 == 0) {
                System.out.println(Character.toLowerCase(ch));

            } else {
                System.out.println(Character.toUpperCase(ch));
            }

        }


    }

}
