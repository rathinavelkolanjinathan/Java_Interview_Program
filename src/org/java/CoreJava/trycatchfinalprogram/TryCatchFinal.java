package org.java.CoreJava.trycatchfinalprogram;

public class TryCatchFinal {
    private final int i = 0;

    public void m1() {
        // i = 21; cann't reassign
        try {
            System.out.println("try block");

        } finally {
            System.out.println("Finally block");
        }
    }


    protected void finalize() throws Throwable {
        System.out.println("finalize block");

    }

    public static void main(String[] args) {
        TryCatchFinal method = new TryCatchFinal();
        method.m1();
        method = null;
        System.gc();

    }
}
