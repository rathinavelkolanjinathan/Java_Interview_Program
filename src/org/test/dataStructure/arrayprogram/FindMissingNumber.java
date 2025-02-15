package org.java.dataStructure.arrayprogram;

public class FindMissingNumber {

	// Needs to check the logic out is wrong
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 11, 12, 13, 15 };
		int length = arr.length;
		//System.out.println("array length " + arrayLength);
		int ideal = (length * (length + 1) / 2);
		System.out.println("ideal::" + ideal);
		int sum = 0; // Arrays.stream(missingNum).sum();
		for (int i = 0; i < length - 1; i++) {
			sum += arr[i];
		}
		System.out.println("Array sum::" + sum);
		int missingNumber = ideal - sum;
		System.out.println("missingNumber::" + missingNumber);
	}
}
