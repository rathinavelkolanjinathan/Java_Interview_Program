package org.test.datastructure.array;

public class FindMissingNumber {

    // Needs to check the logic out is wrong
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 4, 5}; // Replace with your array
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is...... " + missingNumber);
    }

    public static int findMissingNumber(int[] nums) {
        int length = nums.length;
        int totalSum = (length * (length + 1)) / 2; // Sum of first n natural numbers
        int arraySum = 0;

        for (int num : nums) {
            arraySum += num;
        }

        return totalSum - arraySum;
    }
}
