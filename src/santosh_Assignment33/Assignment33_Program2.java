/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]
*/
package santosh_Assignment33;

import java.util.Arrays;

public class Assignment33_Program2 {

	int[] shiftNegativeAndPositiveElements(int[] input) {
		int[] output = new int[input.length];
		int negativeCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[negativeCount] = input[index];
				// System.out.println(negativeCount + " " + output[negativeCount]);
				negativeCount++;
			}
		}

		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[negativeCount] = input[index];
				negativeCount++;
			}
		}

		return output;
	}
	public static void main(String [] args){
		Assignment33_Program2 assignment33_2 = new Assignment33_Program2();
		int[] input2 = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };
		System.out.println("Input : " + Arrays.toString(input2));
		System.out.println("Output : " + Arrays.toString(assignment33_2.shiftNegativeAndPositiveElements(input2)));
	}
 }
		