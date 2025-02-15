package org.java.leetCode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(')
                stack.push(')');

            else  if (c == '{')

                stack.push('}');

            else  if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        boolean bb = isValid("()");
        System.out.println("Balanced brackets::" + bb);

    }
}
