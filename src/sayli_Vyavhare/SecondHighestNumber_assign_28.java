/*Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
*/package sayli_Vyavhare;

import java.util.Scanner;

public class SecondHighestNumber_assign_28 {

	void getSecondHighestNumber(int[] arr) {
		int maxnum = 0, secondmaxnum = 0;
		if (arr[0] > arr[1]) {
			maxnum = arr[0];
			secondmaxnum = arr[1];
		} else {
			maxnum = arr[1];
			secondmaxnum = arr[0];
		}
		for (int index = 2; index < arr.length; index++) {

			if (arr[index] > maxnum) {

				secondmaxnum = maxnum;
				maxnum = arr[index];
			} else if (secondmaxnum > arr[index]) {
				secondmaxnum = arr[index];
			}
		}
		System.out.println("Second Highest number is: " + secondmaxnum);
	}

	int[] getSortedNumbers(int[] arr) {
		int temp = 0, index = 0;
		for (index = 0; index < arr.length; index++) {
			for (int innerindex = index + 1; innerindex < arr.length; innerindex++) {
				if (arr[index] < arr[innerindex]) {

					temp = arr[index];
					arr[index] = arr[innerindex];
					arr[innerindex] = temp;

				}
			}
		}
		return (arr);
	}

	void getNthMaximumNumber(int[] arr, int n) {
		int[] arr1 = getSortedNumbers(arr);
		for (int index = 0; index < arr1.length; index++) {
			if (index == n - 1)
				System.out.println("Highest number is: " + arr1[index]);
		}
	}

	public static void main(String[] args) {

		SecondHighestNumber_assign_28 highestnumber = new SecondHighestNumber_assign_28();
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		System.out.println("Given Array is:");
		for (int index = 0; index < arr.length; index++) {

			System.out.print(arr[index] + " ");
		}
		System.out.println("\n" + "-----------------------------------------------------------");

		highestnumber.getSecondHighestNumber(arr);
		System.out.println("-----------------------------------------------------------" + "\n"
				+ "Which highest number you want enter position:");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		highestnumber.getNthMaximumNumber(arr, n);
	}

}
