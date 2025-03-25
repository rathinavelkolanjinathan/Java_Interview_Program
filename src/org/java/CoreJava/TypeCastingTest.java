package org.java.CoreJava;

public class TypeCastingTest {
    public static void main(String[] args) {
        byte bb = 20;
        short ss = 9;
        char cc = 'c';
        int ii = 0;
        long ll = 2335678;
        float fl = 23567856;
        double dd = 52.2;

        int it = bb;
        int it1 = ss;
        int it2 = cc;
        //The issue arises because you are trying to assign a float value to an
        // int variable, which is not directly compatible in Java. Java does not allow
        // implicit casting from float to int because it may lead to a loss of data.
        // You need to perform explicit casting to convert the float value to an int.
        //int it3=ll;

        //int it4 = fl;
        // int it5=dd;
        ss = bb;

        // Implicit Typecast


        //Explicit Type cast


    }
}
