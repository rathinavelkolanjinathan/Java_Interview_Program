package org.test.datastructure.array;

/**
 * LIS
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int aa = LongestIncreasingSubsequence.getLengthList(arr);
        System.out.println(aa);
    }

    public static int getLengthList(int[] array) {
        int n = array.length;
        int count[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (array[j] < array[i]) {
                    count[i] = count[i] < count[j] + 1 ? count[j] + 1 : count[i];
                    max = max < count[i] ? count[i] : max;

                }
            }
        }
        return max + 1;
    }
}
