package org.test.leetCode;

/**
 * Example 1:
 * <p>
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 * <p>
 * Input: s = "Mr Ding"
 * Output: "rM gniD"
 */
public class ReverseWord {

    public static String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = 0;
        while (right < ch.length) {
            if (ch[right] == ' ') {
                reverse(ch, left, right - 1);
                left = right + 1;
            }
            right++;
        }
        reverse(ch, left, right - 1);
        return new String(ch);
    }

    // reverse algorithm
    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            System.out.println("Revers Of Word......" + temp);
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    public static void main(String[] args) {
        String st = "kolanji";
        String ref = reverseWords(st);
        System.out.println("Revers Of Word........" + ref);
    }
}
