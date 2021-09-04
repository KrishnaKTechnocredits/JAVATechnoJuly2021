package mratunjay.Assignment_28;

import java.util.Scanner;

public class Assignment_28 {

	int[] arr = { 10, 23, 2, 11, 55, 43, 99 };

	int getTheSecondHighestElement(int[] arr) {
		int max = arr[0];
		int maxCountIndex = 0;
		for (int index = 0; index < arr.length; index++) {

			if (max < arr[index]) {
				max = arr[index];
				maxCountIndex = index;
			}
		}

		arr[maxCountIndex] = 0;
		return max;
	}

	void getTheNthHighestElement(int n) {
		int max = 0;
		for (int index = 0; index < n; index++) {

			max = getTheSecondHighestElement(arr);

		}
		System.out.println("Maximum number on entered position:  " + max);
	}

	public static void main(String[] args) {

		Assignment_28 A_28 = new Assignment_28();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Aarray values:  ");
		for (int index = 0; index < A_28.arr.length; index++) {
			System.out.print(" " + A_28.arr[index]);
		}
		System.out.println();
		System.out.println("Enter number to find maximum vlue on entered position in array:  ");
		int input = scanner.nextInt();
		A_28.getTheNthHighestElement(input);
		scanner.close();

	}

}
