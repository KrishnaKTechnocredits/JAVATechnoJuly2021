package suruchi.CodingTest4;

import java.util.Arrays;

public class SCodingTest4 {

	int[] getZeroesEndArray(int[] arr) {
		int count = 0;
		int[] output = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0)
				output[count++] = arr[index];
		}
		while(count < arr.length)
			output[count++] = 0;
		return output;
	}

	public static void main(String[] args) {
		SCodingTest4 scodingTest4 = new SCodingTest4();

		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };

		System.out.println("Array is as displayed: " + Arrays.toString(arr));

		int[] output = scodingTest4.getZeroesEndArray(arr);

		System.out.println("Array with zeroes at the end is: " + Arrays.toString(output));
	}
}