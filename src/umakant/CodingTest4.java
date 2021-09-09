/*
 Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};

 */
package umakant;

import java.util.Arrays;

public class CodingTest4 {
	int[] shiftAllZeroesToEnd(int[] input) {
		int[] output = new int[input.length];
		int startInnderIndex = 0;
		int endInnderIndex = input.length - 1;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0)
				output[startInnderIndex++] = input[index];
			else
				output[endInnderIndex--] = 0;
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		System.out.println(Arrays.toString(new CodingTest4().shiftAllZeroesToEnd(arr)));
	}

}
