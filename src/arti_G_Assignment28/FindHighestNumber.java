package arti_G_Assignment28;

import java.util.Arrays;

/*Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
*/

public class FindHighestNumber {

	int secondHighestNumber(int[] arr) {
		int maxNum = 0;
		int secondMaxNum = 0;

		for (int index = 0; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				secondMaxNum = maxNum;
				maxNum = arr[index];
			} else if (secondMaxNum < arr[index]) {
				secondMaxNum = arr[index];
			}
		}
		return secondMaxNum;
	}

	int getHightest(int[] input) {

		int max = 0;
		int temp = 0;
		int index = 0;

		for (; index < input.length; index++) {
			if (input[index] > max) {
				max = input[index];
				temp = index;
			}
		}
		input[temp] = 0;
		return max;
	}

	int nthHighestNumber(int[] input, int n) {

		int num = 0;
		System.out.println("Given array : " + Arrays.toString(input));
		for (int index = 0; index < n; index++) {
			num = getHightest(input);

		}
		return num;
	}

	public static void main(String[] args) {
		FindHighestNumber findHighestNumber = new FindHighestNumber();
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		System.out.println("Second max number of input Array:" + findHighestNumber.secondHighestNumber(arr));

		int[] input = { 10, 23, 2, 11, 55, 43, 99 };
		System.out.println("Nth highest number of input Array:" + findHighestNumber.nthHighestNumber(input, 3));
	}

}
