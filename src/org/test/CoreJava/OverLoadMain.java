package org.test.CoreJava;
//The reason the stringDemo method is called instead of the Object method when you pass null is due to how Java handles method overloading and type resolution.

//Java uses the most specific method available when choosing between overloaded methods. In your case, the method method(stringDemo str) is considered more specific than method(Object object) because stringDemo is a subclass of Object.

//When you pass null as an argument, Java will try to match it with the most specific method, which is the one with the stringDemo parameter. Therefore, the method(stringDemo str) is called.
public class OverLoadMain {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object object) {

        System.out.print("Object will print"+object);
    }

    public static void method(String str) {
        System.out.print("stringDemo will print"+str);

    }
}
