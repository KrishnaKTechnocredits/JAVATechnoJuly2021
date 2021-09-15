/*
 * Test 5 :
Find first 5 perfect numbers.
 */
package umakant;

import java.util.Arrays;

public class Coding5 {

	private boolean isPerfectNumber(int input) {
		if (input > 1) {
			int sum = 1;
			for (int index = 2; index <= input / 2; index++) {
				if (input % index == 0)
					sum += index;
			}
			return input == sum;
		} else
			return false;
	}

	int[] firstPerfectNumbers(int startIndex, int count) {
		int[] output = new int[count];
		int index = 0;
		while (count > 0) {
			if (isPerfectNumber(startIndex)) {
				output[index++] = startIndex;
				count--;
			}
			startIndex++;
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new Coding5().firstPerfectNumbers(1, 4)));
	}

}
