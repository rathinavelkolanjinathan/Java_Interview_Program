package org.java.CoreJava.JDK17.EncapsulateJdkInternal;

import sun.misc.Unsafe;
//The goal is to limit the use of internal APIs by third-party applications and libraries,
// which can improve the security and stability of Java applications.
public class MyClass {
    public static void main(String[] args) {

            Unsafe unsafe = Unsafe.getUnsafe();
            long value = unsafe.allocateMemory(1024);
            System.out.println(value);

    }
}
