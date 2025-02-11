package org.java.leetCode.Array;

/**
 * Working fine
 */

public class FindNumbersWithEvenNumberOfDigits {
    public static int findNumbers(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if((num[i]>9 && num[i]<100) || (num[i]>999 && num[i]<10000) ||
                    (num[i]>99999 && num[i]<1000000)||
                    (num[i]>9999999 && num[i]<100000000)||num[i]>100000000){
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896};
       // int largest = Arrays.stream(nums).filter((i) -> i % 2 == 0).max().getAsInt();
        //System.out.print(largest);
        //int[]  num = {555,901,482,1771};
      int result=  FindNumbersWithEvenNumberOfDigits.findNumbers(num);
        System.out.print(result);
    }
}
