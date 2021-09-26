package arti_G;

/*Assignment 14 : 15th Aug'2021
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
output : 55*/

public class Assignment_14 {
	// 1 program
	int maxNumbers(int[] input) {
		int maxNum = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxNum) {
				maxNum = input[index];
			}

		}
		return maxNum;
	}

	// 2 program
	int minNumbers(int[] num) {
		int minNumber = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] < minNumber) {
				minNumber = num[index];
			}
		}
		return minNumber;
	}

	// 3 program
	int findDifference(int[] number) {
		Assignment_14 assignment_14 = new Assignment_14();
		assignment_14.maxNumbers(number);
		assignment_14.minNumbers(number);
		int difference = maxNumbers(number) - minNumbers(number);
		return difference;
	}

	// 4 program
	int findDifferenceMaxOddMinEven(int[] arr) {
		int maxOdd = arr[0];
		int maxEven = arr[0];
		int difference = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 != 0) {
				if (arr[index] > maxOdd) {
					maxOdd = arr[index];
				}
			} else {
				if (arr[index] > maxEven) {
					maxEven = arr[index];
				}
			}
		}
		if (maxOdd > maxEven) {
			difference = maxOdd - maxEven;
		} else {
			difference = maxEven - maxOdd;
		}
		return difference;
	}

	public static void main(String[] args) {
		Assignment_14 assignment_14 = new Assignment_14();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Maximum number from given Array: ");
		System.out.println(assignment_14.maxNumbers(input));

		Assignment_14 assignment_14_1 = new Assignment_14();
		int[] num = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Minimum numbers from given Array : ");
		System.out.println(assignment_14_1.minNumbers(num));

		Assignment_14 assignment_14_2 = new Assignment_14();
		int[] number = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Difference difference between max and min number from given array : ");
		System.out.println(assignment_14_2.findDifference(number));

		Assignment_14 assignment_14_3 = new Assignment_14();
		int[] arr = { 1, 11, 44, 23, 55, 99, 23, 22 };
		System.out.println("Difference between max odd number and max even number from given array :");
		System.out.println(assignment_14_3.findDifferenceMaxOddMinEven(arr));
	}

}
