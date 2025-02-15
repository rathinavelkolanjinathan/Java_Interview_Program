package org.java.coreJavaprogram.java8.methodreference;

public class ConstructorReferenceMain {
    public static void main(String[] args) {
        Messageable ms = ConstructorReference::new;
        ms.getMessage("Hello");


    }
}
