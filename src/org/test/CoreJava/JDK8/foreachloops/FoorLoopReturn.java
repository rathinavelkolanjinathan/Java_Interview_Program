package org.test.CoreJava.JDK8.foreachloops;

public class FoorLoopReturn {
    public static String frechlop(String[] geek)
    {
        int count = 0;
        for (String var : geek) {
            if (count == 1)
                return var;
            count++;
        }
        return "";
    }

    public static void main(String[] args)
            throws Exception
    {

        String[] arr1 = { "Geeks", "For", "Geeks" };
        String secelt = frechlop(arr1);
        System.out.println(secelt);
    }
}
