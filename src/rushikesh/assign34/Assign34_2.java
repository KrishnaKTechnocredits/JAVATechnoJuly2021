package rushikesh.assign34;

import java.util.Arrays;
/* 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
 */
public class Assign34_2 {
	int[] placeTripletSumAfterTriplet(int[] input) {
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
				output[ouputIndex++] = 3 * (input[index] - 1);
			} else
				output[ouputIndex++] = input[index];
		}
		while (index < input.length)
			output[ouputIndex++] = input[index++];
		return output;
	}
	public static void main(String[] args) {
		Assign34_2 assign34_2=new Assign34_2();
		int[] input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
		System.out.println(Arrays.toString(assign34_2.placeTripletSumAfterTriplet(input)));	
	}
}

