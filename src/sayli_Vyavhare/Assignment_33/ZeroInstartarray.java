
/*Assignment - 33 : 11th Sep'2021

Program 1 : shift all non zeros at the start.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]

*/
package sayli_Vyavhare.Assignment_33;

import java.util.Arrays;

class ZeroInstartarray {

	int[] getZeroAtStartOfArray(int[] input) {
		int zeroCount = 0;
		int[] output = new int[input.length];

		for (int index = 0; index < input.length; index++) {

			if (input[index] == 0)
				zeroCount++;
		}

		int outputIndex = zeroCount;
		for (int index = 0; index < input.length; index++) {

			if (input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;

	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 2, 0, 8, 9, 0, 0, 0, 5, 7 };
		ZeroInstartarray zero = new ZeroInstartarray();
		System.out.println("Given array is: "+ Arrays.toString(input));
		int[] arr = zero.getZeroAtStartOfArray(input);
		System.out.print("Array with Zero's at start of array is: "+ Arrays.toString(arr));
		
	}

}
