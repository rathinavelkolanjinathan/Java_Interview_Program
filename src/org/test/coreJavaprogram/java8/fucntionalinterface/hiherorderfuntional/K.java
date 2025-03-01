package org.test.coreJavaprogram.java8.fucntionalinterface.hiherorderfuntional;

public interface K {

    abstract void m3(I object, J objects);

    public static void main(String[] args) {
        I obj = () -> {
            return 111;
        };

        J obj1 = () -> {
            return 222;
        };

        K obj3 = (I x, J y) -> {

            System.out.println(x.m1() + y.m2());
        };

		obj3.m3(obj, obj1);

		//Its allow always function as a input (Single or multilple)
		// it will provide always out put function
    }
}
