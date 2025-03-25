package org.java.datastructure.string;

public class RemoveFirstandLastChar {
    public static void main(String args[]) {
        // 1st example: You can use substring() method to remove first // and the last character from stringDemo in
        String text = "iMac";
        String withoutFirstCharacter = text.substring(1); // index starts at zero
        String withoutLastCharacter = text.substring(0, text.length() - 1);
        //System.out.println("Using SubString() method: ");
        System.out.println("input string: " + text);
        System.out.println("without first character: " + withoutFirstCharacter);
        System.out.println("without last character: " + withoutLastCharacter);
    }
}