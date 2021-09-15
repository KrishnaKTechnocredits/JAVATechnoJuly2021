/*
 WAP to remove a specific element from an array
int input[] = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
specific number: 14
output[] = {25, 56, 15, 36, 56, 77, 18, 29, 49}
 */
package umakant;

import java.util.Arrays;

public class CodingTest3 {

	int[] removeSpecificElement(int[] input, int number) {
		int[] output = new int[input.length - 1];
		int outputIndex=0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != number)
				output[outputIndex++] = input[index];
		}
		return output;
	}

	public static void main(String[] args) {
		int input[] = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		System.out.println(Arrays.toString(new CodingTest3().removeSpecificElement(input, 14)));
	}
}
