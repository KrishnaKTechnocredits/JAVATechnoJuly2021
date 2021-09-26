/*
 * program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];

 */
package husain.Assignment34;

import java.util.Arrays;

public class Program2 {

	boolean findConsecutive(int num1, int num2, int num3) {
		if (num2 == num1 + 1 && num3 == num2 + 1)
			return true;
		return false;

	}

	void loopArray(int arr[]) {

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
				output[newIndex + 3] = arr[index] + arr[index + 1] + arr[index + 2];
				index = index + 2;
				newIndex = newIndex + 4;
			} else {
				output[newIndex] = arr[index];
				newIndex++;
			}
			if (index + 1 == 15)
				output[newIndex] = arr[index + 1];

		}

		System.out.println("The output array with sum of triplets following the sequence is "+Arrays.toString(output));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 obj = new Program2();
		int arr[] = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		System.out.println("The input array is "+Arrays.toString(arr));
		obj.loopArray(arr);

	}

}
