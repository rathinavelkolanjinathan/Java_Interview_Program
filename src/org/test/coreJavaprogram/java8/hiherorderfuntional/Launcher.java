package org.java.coreJavaprogram.java8.hiherorderfuntional;

public class Launcher {
    public static void main(String[] args) {

        Funtionalinterfacetest funtionalinterfacetest = () -> {
            return 111;
        };
        TestInterface testInterface = () -> {
            return 222;
        };
        TestInterfaceB testInterfaceB = (Funtionalinterfacetest ii, TestInterface jj) -> {

            System.out.println(ii.m1() + jj.m2());
        };
        testInterfaceB.m3(funtionalinterfacetest, testInterface);
    }

}
