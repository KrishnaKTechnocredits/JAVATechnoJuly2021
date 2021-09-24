/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
*/
package santosh_Assignment33;

import java.util.Arrays;
public class Assignment33_Program_3 {

	int[] getRearrangedElements(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		int zeroCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[count] = input[index];
				count++;
			} else if (input[index] == 0)
				zeroCount++;
		}
		int positiveCount = count + zeroCount;
		for (int index = 0; index < input.length; index++) {

			if (input[index] > 0) {
				output[positiveCount] = input[index];
				positiveCount++;
			}
		}

		return output;
	}

    public static void main(String [] args){
		Assignment33_Program_3 assignment33_3 = new Assignment33_Program_3();
		int[] input3 = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		System.out.println("Input : " + Arrays.toString(input3));
		System.out.println("Output : " + Arrays.toString(assignment33_3.getRearrangedElements(input3)));
	}
} 