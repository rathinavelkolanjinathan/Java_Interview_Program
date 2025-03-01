package org.test.coreJavaprogram.java8.defaultInterface.inheritence;


public class InheritanceMain implements Cube, Square {


    @Override
    public void calc(int x) {
        Cube.super.calc(x);
        Square.super.calc(x);
    }

    public static void main(String[] args) {
        InheritanceMain main = new InheritanceMain();
        main.calc(100);
    }
}
