package org.test.coreJavaprogram.collection.generics;

/**
 * Example for Raw Type collection
 *
 * @param <T>
 */
public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        System.out.println("TT"+t);
        this.t = t;
    }

    public static void main(String[] args) {


        Box<String> st = new Box<>();  //scenario 1
        Box st1= st;

        Box b= new Box(); // scenario 2
        Box<Integer> bb =b;

        Box<String> ss= new Box<>();
        Box c= ss;
        c.setT(8);



    }
}
