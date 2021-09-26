/*Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/

package shraddha.Assignment28;

import java.util.Arrays;
import java.util.Scanner;

public class NthHighestNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 10, 23, 2, 11, 55, 43, 99 };
		NthHighestNumberInArray newObject = new NthHighestNumberInArray();
		System.out.println("Input Array is :- " + Arrays.toString(arr));
		newObject.sortArrayInAscendingOrder(arr);
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"please enter which highest number you want to see in the array ? please enter the number between 0 - "
						+ arr.length);
		int position = sc.nextInt();
		if (position < arr.length)
			System.out.println(position + " highest number in array is :- " + (arr[arr.length - position]));
		else
			System.out.println("Invalid Input !! please enter number between 0 - " + arr.length);
	}

	void sortArrayInAscendingOrder(int[] inputArray) {
		int temp;
		// Sort the array in ascending order
		for (int index = 0; index < inputArray.length; index++) {
			for (int j = index + 1; j < inputArray.length; j++) {
				if (inputArray[index] > inputArray[j]) {
					temp = inputArray[index];
					inputArray[index] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
	}

}
