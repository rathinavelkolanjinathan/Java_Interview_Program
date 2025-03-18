package org.test.dataStructure.string;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String args[]) {
        String st = "hello";
        char ch;//local variable
        Scanner scan = new Scanner(System.in);
        //takes input from the user
        System.out.print("Enter an character: ");
        //get input and it is stored ch variable
        ch = scan.next().charAt(0);

        char ch1 = st.charAt(0);
        if ((ch1 >= 97 && ch1 <= 122) || (ch1 >= 65 && ch1 <= 90)) {
            System.out.print(ch1 + " is an Alphabet: ");
        } else {
            System.out.print(ch1 + " is not an Alphabet: ");
        }
    }
}
