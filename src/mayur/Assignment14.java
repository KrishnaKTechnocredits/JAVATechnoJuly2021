/*
 * Assignment 14 : 15th Aug'2021
program 1 : find maximum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 99

program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11

program 3 : print difference between max and min number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 98


program 4 : print difference between max odd number and max even number from given array. difference should be positive
int[] input = {1,11,44,23,55,99,23,22};
hint : 99 - 44
output : 55

 */
package mayur;

public class Assignment14 {

	int maxNumber(int arr[]) {
		int maxNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (maxNum <= arr[index])
				maxNum = arr[index];
		}
		System.out.println("Maximum value in given array is : " + maxNum);
		return maxNum;
	}

	int minNumber(int arr[]) {
		int minNum = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (minNum >= arr[index])
				minNum = arr[index];
		}
		System.out.println("Minimum value in given array is :" + minNum);
		return minNum;
	}

	void diffbetweenMaxandMinNumber(int max, int min) {
		int diff;
		diff = max - min;
		System.out.println("difference between " + max + " and " + min + " number :" + diff);
	}

	void diffbetMaxOddAndMaxEven(int[] arr) {
		int even = arr[0];
		int odd = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				if (even < arr[index])
					even = arr[index];
			} else {
				if (odd < arr[index])
					odd = arr[index];
			}
		}
		if (even > odd) {
			int maxDifference = even - odd;
			System.out.println("Difference between max even number " + even + " and max odd number " + odd + " is : "
					+ maxDifference);
		}else {
			int maxDifference = odd - even;
		    System.out.println("Difference between max odd number " + odd + " and max even number " + even + " is : "
				+ maxDifference);
		}
		
	}

	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		int maxValue = assignment14.maxNumber(input);
		int minValue = assignment14.minNumber(input);
		assignment14.diffbetweenMaxandMinNumber(maxValue, minValue);
		int [] input1 = {1,11,44,23,55,99,23,22};
		assignment14.diffbetMaxOddAndMaxEven(input1);
	}
}
