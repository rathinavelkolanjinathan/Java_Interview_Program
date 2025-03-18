package org.test.CoreJava.JDK8.joinstring;

import org.apache.commons.lang3.StringUtils;

public class StringUtilsJoinTest {
    public static void main(String[] args) {
        String[] st = {"how", "are", "you"};
        String join = StringUtils.join(st, ",");
        System.out.println("StringUtilsJoin " + join);

    }
}
