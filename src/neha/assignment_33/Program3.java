package neha.assignment_33;

import java.util.Arrays;

/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]*/
public class Program3 {
	void displayArrayAfterShiftingNegativeZeroPositiveNum(int[] arr) {
		int oLength = arr.length;
		int[] output = new int[oLength];
		int oIndex = 0;
		int zeroCount = 0;
		for (int i = 0; i < oLength; i++) {
			if (arr[i] < 0) {
				output[oIndex] = arr[i];
				oIndex++;
			}
			if (arr[i] == 0)
				zeroCount++;
		}
		for (int i = 0; i < oLength; i++) {
			if (arr[i] > 0) {
				output[oIndex + zeroCount] = arr[i];
				oIndex++;
			}
		}
		System.out.println(
				"Array after shifting negative numbers at the beginning ,zero and all positive numbers at the end is "
						+ Arrays.toString(output));
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		int[] input = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		program3.displayArrayAfterShiftingNegativeZeroPositiveNum(input);
	}
}
