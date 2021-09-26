package rushikesh.assign34;

import java.util.Arrays;

/*
Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];
 */
public class Assign34_1 {
		int[] placeZeroAfterTriplet(int[] input) {
			int count = 0;
			for (int index = 0; index < input.length - 2; index++) {
				if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2)
					count++;
			}
			int[] output = new int[input.length + count];
			int ouputIndex = 0;
			int index;
			for (index = 0; index < input.length - 2; index++) {
				if (input[index + 1] == input[index] + 1 && input[index + 2] == input[index] + 2) {
					output[ouputIndex++] = input[index++];
					output[ouputIndex++] = input[index++];
					output[ouputIndex++] = input[index];
					output[ouputIndex++] = 0;
				} else
					output[ouputIndex++] = input[index];
			}
			while (index < input.length)
				output[ouputIndex++] = input[index++];
			return output;
		}
	
	public static void main(String[] args) {
		Assign34_1 assign34_1=new Assign34_1();
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println(Arrays.toString(assign34_1.placeZeroAfterTriplet(input)));
	}
}
