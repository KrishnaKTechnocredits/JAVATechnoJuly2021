/*
Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]

*/
package husain.Assignment33;

import java.util.Arrays;

public class Program2 {

	void loopArray(int arr[]) {

		int output[] = new int[arr.length];
		int count = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				output[count] = arr[index];
				count++;
			}
		}

		for (int index = 0; index < output.length; index++) {
			if (arr[index] > 0) {
				output[count] = arr[index];
				count++;
			}
		}

		System.out.println("The output array is " + Arrays.toString(output));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Program2 obj = new Program2();
		int arr[] = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		System.out.println("The input array is " + Arrays.toString(arr));
		obj.loopArray(arr);

	}

}
