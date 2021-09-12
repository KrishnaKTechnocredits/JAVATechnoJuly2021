/*Test 4 :
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};*/

package astha.CodingTest.Test4;

import java.util.Arrays;

public class Test4 {

	int[] getRearrangedArray(int[] input) {
		int[] output = new int[input.length];
		int zerosIndex = 0;
		int nonZerosIndex = input.length - 1;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[zerosIndex] = input[index];
				zerosIndex++;
			} else
				output[nonZerosIndex] = input[index];
		}
		return output;
	}

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		int[] input = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };
		System.out.println("Input Array : " +Arrays.toString(input));
		System.out.println("Output Array : "+Arrays.toString(test4.getRearrangedArray(input)));
	}
}
