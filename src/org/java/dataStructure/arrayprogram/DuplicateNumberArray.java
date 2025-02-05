package org.java.dataStructure.arrayprogram;
import java.util.Arrays;
public class DuplicateNumberArray {
	// private static final Logger logger =
	// LoggerFactory.getLogger(DuplicateNumber.class);
	public static void main(String args[]) {
		int[][] test = new int[][] { { 1, 1, 2, 2, 3, 4, 5 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 2, 3, 4, 5, 6, 7 },
				{ 1, 2, 1, 1, 1, 1, 1 }, };
		for (int[] input : test) {
			System.out.println("Array with Duplicates       : " + Arrays.toString(input));
			System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
		}
	}
	public static int[] removeDuplicates(int[] inputArray) {
		// Sorting array to bring duplicates together
		Arrays.sort(inputArray);
		int[] result = new int[inputArray.length];
		int previous = inputArray[0];
		result[0] = previous;
		for (int i = 1; i < inputArray.length; i++) {
			int ch = inputArray[i];
			if (previous != ch) {
				result[i] = ch;
			}
			previous = ch;
		}
		return result;
	}
}
