package org.java.datastructure.string;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String args[]) {
        System.out.println("Please enter some text");
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        char[] letters = input.toCharArray();
        int count = 0;
        for (char c : letters) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default: // no count increment } } System.out.println("Number of vowels in stringDemo [" +
                    // input + "] is : " + count); }
            }
        }
        System.out.println("Number of vowels in stringDemo [" + input + "]" + "is" + count);

    }

}
