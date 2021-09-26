/*program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]*/
package shalaka.Assignment33;

import java.util.Arrays;

public class PlaceNegativeNoZerosPositiveNos {
	int[] placementOfNegativeNoZerosPositiveNos(int[] input) {
		int count = 0;
		int zeroCount = 0;
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] < 0) {
				output[count] = input[index];
				count++;
			}
			if (input[index] == 0)
				zeroCount++;
		}

		int outputIndex = count + zeroCount;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 1, -3, 0, -2, 11, 0, 44, 55, -76, 33, 0, 12 };
		PlaceNegativeNoZerosPositiveNos placeNegativeNoZerosPositiveNos = new PlaceNegativeNoZerosPositiveNos();
		int[] output = placeNegativeNoZerosPositiveNos.placementOfNegativeNoZerosPositiveNos(input);
		System.out.println("After placing all negative numbers at the beginning, zeros and all positive numbers at the end: ");
		System.out.println(Arrays.toString(output));
	}
}
