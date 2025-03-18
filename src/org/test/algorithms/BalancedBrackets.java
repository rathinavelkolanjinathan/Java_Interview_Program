package org.test.algorithms;

import java.util.Stack;

public class BalancedBrackets {


    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        //char[] cc= expression.toCharArray();
        for (char ch : expression.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }

                char top = stack.pop(); // Pop the top of the stack
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false; // Mismatched pair
                }
            }
        }

        // The stack should be empty if brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // String expression = "{[()]}"; // Test expression
        String expression = "[{(x+y]*2}-3z)";
        if (isBalanced(expression)) {
            System.out.println("The brackets are balanced!");
        } else {
            System.out.println("The brackets are not balanced!");
        }
    }
}
