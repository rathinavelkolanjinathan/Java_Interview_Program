package org.test.CoreJava.TryCatchFinalProgram;

public class TryWithReturn {

    public static void main(String[] args) {
        System.out.println(TryWithReturn.m1());
    }

    public static int m1() {

        try {
            return 1;

        } catch (Exception e) {
            return 2;

        } finally {
            System.exit(0);
            return 1;
        }
    }
}
