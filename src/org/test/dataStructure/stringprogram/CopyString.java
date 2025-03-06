package org.test.dataStructure.stringprogram;

public class CopyString {


    public static void main(String[] args) {
        char[] arr = {'p', 'q', 'r', 's'};
        String str = String.copyValueOf(arr, 1, 2);
        System.out.println("Copy Of Value....." + str);

        String st = "hello";

        char[] cha = st.toCharArray();

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < cha.length; i++) {
            build.append(cha[i]);
            build.append(cha[i]);

        }
        System.out.println("Copy Of Character...... " + build);

    }

}
