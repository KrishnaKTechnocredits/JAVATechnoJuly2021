package parthav.parthavD_Assignment48;

/*
 * program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

 */

import java.util.Arrays;

public class NewProgram {

	boolean findConsecutive(int num1, int num2, int num3) {
		if (num2 == num1 + 1 && num3 == num2 + 1)
			return true;
		return false;

	}

	void loopArray(int arr[]) {

		int sum = 0;
		int maxSum = 0;
		int maxIndex = 0;
		int count = 0;
		int newIndex = 0;

		for (int index = 0; index < arr.length; index++) {
			if (index + 2 < arr.length)
				if (findConsecutive(arr[index], arr[index + 1], arr[index + 2])) {
					count++;
				}
		}

		int output[] = new int[arr.length + count];
		for (int index = 0; index < arr.length - 1; index++) {
			if (findConsecutive(arr[index], arr[index + 1], arr[index + 2])) {
				output[newIndex] = arr[index];
				output[newIndex + 1] = arr[index + 1];
				output[newIndex + 2] = arr[index + 2];
				index = index + 2;
				newIndex = newIndex + 4;
			} else {
				output[newIndex] = arr[index];
				newIndex++;
			}
			/*if (index + 1 == 15)
				output[newIndex] = arr[index + 1];*/

		}

		System.out.println("The output array with 0 following sequence of triplets is " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewProgram obj = new NewProgram();
		int arr[] = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		System.out.println("The input array is " + Arrays.toString(arr));
		obj.loopArray(arr);

	}

}
