package suruchi.Assignment28;

import java.util.Arrays;
import java.util.Scanner;

public class HighestNumArray_A28 {

	int getSecondHighestNumber(int[] arr) {
		int maxNum = 0;
		int secondMaxNum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNum) {
				secondMaxNum = maxNum;
				maxNum = arr[index];
			} else if (arr[index] != maxNum && arr[index] > secondMaxNum) {
				secondMaxNum = arr[index];
			}
		}
		return secondMaxNum;
	}

	int getHighestNumInArray(int[] arr) {
		int maxNum = 0;
		int maxCount = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxNum) {
				maxNum = arr[index];
				maxCount = index;
			}
		}
		arr[maxCount] = 0;
		return maxNum;
	}

	int getNthHighestNumber(int[] input, int n) {
		int nthMaxNum = 0;
		for (int index = 0; index < n; index++) {
			nthMaxNum = getHighestNumInArray(input);
		}
		return nthMaxNum;
	}

	public static void main(String[] args) {
		HighestNumArray_A28 highestNumArray_A28 = new HighestNumArray_A28();

		Scanner scanner = new Scanner(System.in);

		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };

		System.out.println("Input array displayed as: " + Arrays.toString(arr));

		System.out.println("\nFind second highest number in the array");
		System.out.println("Second highest value is: " + highestNumArray_A28.getSecondHighestNumber(arr));

		System.out.println("\nFind nth highest number in the array");
		System.out.println("Enter the n value: ");
		int n = scanner.nextInt();

		System.out
				.println("Highest value at position " + n + " is: " + highestNumArray_A28.getNthHighestNumber(arr, n));

		scanner.close();
	}
}