package org.java.coreJavaprogram.java8.lamdaexpression;

public class TypesLamdaLaunch {
    public static void main(String[] args) {

        FunctionalInterOne i = () -> {
            System.out.println("void Type Test");
        };
        i.m1();
        FunctionalInterTwo j = (int x) -> {
            System.out.println("Void with param" + x);
        };
        j.m2(10);
        FunctionalInterThree k = () -> {
            return 234;
        };
        k.m3();
        FunctionalInterFour l = (x) -> {
            return x * x;
        };
        int ii = l.m4(10);
        System.out.println("Void with param" + ii);
    }

}
