package org.test.dataStructure.arrayprogram;

public class FindMissingNumber {

    // Needs to check the logic out is wrong
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 4, 5}; // Replace with your array
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = (n * (n + 1)) / 2; // Sum of first n natural numbers
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }
}
