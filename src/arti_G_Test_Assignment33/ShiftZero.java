package arti_G_Test_Assignment33;

import java.util.Arrays;

/*Assignment - 33 : 11th Sep'2021

Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]

program 4 : find the triple which in sequence and having maximum sum
input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		iteration : 3,4,5
		         9,10,11
				 10,11,12
		         1,2,3
		output : 10,11,12*/

public class ShiftZero {

	void shiftZero(int arr[]) {
		int count = 0;
		int output[] = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				count++;
			}
		}
		for (int index = 0; index < output.length; index++) {
			if (arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
		}
		System.out.println("The output of array is " + Arrays.toString(output));

	}

	void program2(int arr1[]) {
		int output[] = new int[arr1.length];
		int count = 0;
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] < 0) {
				output[count] = arr1[index];
				count++;
			}
		}
		for (int index = 0; index < output.length; index++) {
			if (arr1[index] > 0) {
				output[count] = arr1[index];
				count++;
			}
		}
		System.out.println("The outpur array is " + Arrays.toString(output));
	}

	void program3(int arr2[]) {
		int output[] = new int[arr2.length];
		int count = 0;
		int zeroCount = 0;
		for (int index = 0; index < arr2.length; index++) {
			if (arr2[index] < 0) {
				output[count] = arr2[index];
				count++;
			} else if (arr2[index] == 0) {
				zeroCount++;
			}
		}
		for (int index = 0; index < output.length; index++) {
			if (arr2[index] > 0) {
				output[count + zeroCount] = arr2[index];
				count++;
			}
		}
		System.out.println("The output array is " + Arrays.toString(output));
	}

	// 4 program
	boolean findConsecutive(int num1, int num2, int num3) {
		if (num2 == num1 + 1 && num3 == num2 + 1)
			return true;
		return false;
	}

	void getTriplets(int arr3[]) {
		int sum = 0;
		int maxSum = 0;
		int maxIndex = 0;
		for (int index = 0; index < arr3.length; index++) {
			if (index + 2 < arr3.length) {
				if (findConsecutive(arr3[index], arr3[index + 1], arr3[index + 2])) {
					sum = arr3[index] + arr3[index + 1] + arr3[index + 2];
					if (sum > maxSum) {
						maxSum = sum;
						maxIndex = index;
					}

				}
			}
		}
			System.out.println("The triple " + arr3[maxIndex] + ", " + arr3[maxIndex + 1] + ", " + arr3[maxIndex + 2]
					+ " of consecutive numbers in the given array " + Arrays.toString(arr3) + " has max count "
					+ maxSum);
		}

	

	public static void main(String[] args) {
		ShiftZero s1 = new ShiftZero();
		int arr[] = { 1, 0, 3, 4, 0, 2, 88, 0, 0, 22, 34 };
		System.out.println("The input array is " + Arrays.toString(arr));
		s1.shiftZero(arr);
		System.out.println("--------------------------------------");

		int arr1[] = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		System.out.println("The input array is " + Arrays.toString(arr1));
		s1.program2(arr1);
		System.out.println("--------------------------------------");

		int arr2[] = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		System.out.println("The input array is " + Arrays.toString(arr2));
		s1.program3(arr2);
		System.out.println("--------------------------------------");

		int arr3[] = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 12, 44, 67, 1, 2, 3, 99 };
		s1.getTriplets(arr3);
	}

}
