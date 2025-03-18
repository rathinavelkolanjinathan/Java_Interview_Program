package org.test.CoreJava.collection.generics;

/**
 * Example for Raw Type collection
 *
 * @param <T>
 */
public class RawType<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        System.out.println("TT"+t);
        this.t = t;
    }

    public static void main(String[] args) {


        RawType<String> st = new RawType<>();  //scenario 1
        RawType st1= st;

        RawType b= new RawType(); // scenario 2
        RawType<Integer> bb =b;

        RawType<String> ss= new RawType<>();
        RawType c= ss;
        c.setT(8);



    }
}
