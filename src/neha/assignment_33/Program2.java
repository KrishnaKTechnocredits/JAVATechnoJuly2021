package neha.assignment_33;

import java.util.Arrays;

/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]*/
public class Program2 {
	void displayArrayAfterShiftingNegativePositiveNum(int[] arr) {
		int oLength = arr.length;
		int[] output = new int[oLength];
		int oIndex = 0;
		for (int i = 0; i < oLength; i++) {
			if (arr[i] < 0) {
				output[oIndex] = arr[i];
				oIndex++;
			}
		}
		for (int i = 0; i < oLength; i++) {
			if (arr[i] > 0) {
				output[oIndex] = arr[i];
				oIndex++;
			}
		}
		System.out.println(
				"Array after shifting negative numbers at the beginning and all positive numbers at the end is "
						+ Arrays.toString(output));
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		int[] input = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		program2.displayArrayAfterShiftingNegativePositiveNum(input);
	}
}
