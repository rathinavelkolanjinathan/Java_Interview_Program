package org.test.coreJavaprogram.String;

public class SubstringDemo {
    public static void main(String[] args) {
        String str = "hello world !";
       String result=  str.substring(6,12)+str.substring(12,6);
       System.out.println(result);
    }
}
