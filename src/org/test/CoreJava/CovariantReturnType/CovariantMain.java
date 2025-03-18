package org.test.CoreJava.CovariantReturnType;

//As you can see in the above example, the return type of the get()
// method of CovariantReturnType class is CovariantReturnType but the return type of the get() method of CovariantReturnType1 class is CovariantReturnType1.
// Both methods have different return type but it is method overriding.
// This is known as covariant return type.

//Advantages of Covariant Return Type
//Following are the advantages of the covariant return type.
//
//1) Covariant return type assists to stay away from the confusing type casts
// in the class hierarchy and makes the code more usable, readable, and maintainable.


//2) In the method overriding, the covariant return type provides the liberty to have more to the point return types.

//3) Covariant return type helps in preventing the run-time ClassCastExceptions on returns.
public class CovariantMain {
    public static void main(String[] args) {
        new CovariantReturnType1().get().message();
    }
}
