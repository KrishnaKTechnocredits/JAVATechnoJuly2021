/*
Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
*/

package husain.Assignment28;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	int findMaxNum(int arr[]) {

		int maxIndex = 0;
		int maxNum = 0;
		for (int index = 0; index < arr.length; index++)
			if (arr[index] > maxNum) {
				maxNum = arr[index];
				maxIndex = index;
			}
		arr[maxIndex] = 0;
		return maxNum;
	}

	int findNthNum(int input[], int value) {
		int num = 0;
		while (value > 0) {
			num = findMaxNum(input);
			value--;
		}

		return num;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program2 obj = new Program2();
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		int val = 5;
		System.out.println("The " + val + "th highest value in the array " + Arrays.toString(arr) + " is "
				+ obj.findNthNum(arr, val));

	}

}
