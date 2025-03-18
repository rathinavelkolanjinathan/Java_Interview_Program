package org.test.CoreJava.CovariantReturnType;

public class CovariantReturnType1 extends CovariantReturnType {
    public CovariantReturnType1 get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant return type");
    }
}
