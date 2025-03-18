package org.test.dataStructure.string;

public class ImmutableCheck {
    public static void main(String[] args) {
        String st = new String("kolanji");
        String st2 = "nathan";

        System.out.println(st.intern().hashCode() == st2.hashCode());
        System.out.println(st.hashCode() == st2.hashCode());
        System.out.println(st.intern());
        System.out.println(st2.intern());

        String password = "123456";
        password.concat("123");
        System.out.println(password);
    }
}
