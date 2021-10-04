/*Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99]; 

*/

package sayli_Vyavhare.Assignment34;

import java.util.Arrays;

public class Place_SumZero_Triplets {
	void getSumOfTriplets(int[] input) {

		int count = 0, sum = 0;

		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == (input[index + 1] - 1) && input[index + 1] == input[index + 2] - 1) {

				count++;

			}
		}

		int[] output = new int[input.length + count];
		int newIndex = 0;

		for (int index = 0; index < input.length; index++) {

			if ((index < input.length - 2)
					&& (input[index] == (input[index + 1] - 1) && input[index + 1] == input[index + 2] - 1)) {
				output[newIndex] = input[index];
				output[newIndex + 1] = input[index + 1];

				output[newIndex + 2] = input[index + 2];
				sum = input[index] + input[index + 1] + input[index + 2];
				output[newIndex + 3] = sum;
				newIndex += 4;
				index += 2;
				sum = 0;
			} else {
				output[newIndex] = input[index];
				newIndex++;
			}
		}
		System.out.println("Array after placing sum of triplets after each triple which in sequence :" + 
		"\n"+ Arrays.toString(output));
	}

	void getZeroAfterTriplets(int[] input) {

		int count = 0, sum = 0;

		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == (input[index + 1] - 1) && input[index + 1] == input[index + 2] - 1) {

				count++;
			}
		}

		int[] output = new int[input.length + count];
		int newIndex = 0;

		for (int index = 0; index < input.length; index++) {

			if ((index < input.length - 2)
					&& (input[index] == (input[index + 1] - 1) && input[index + 1] == input[index + 2] - 1)) {
				output[newIndex] = input[index];
				output[newIndex + 1] = input[index + 1];

				output[newIndex + 2] = input[index + 2];
				output[newIndex + 3] = 0;
				newIndex += 4;
				index += 2;
			} else {
				output[newIndex] = input[index];
				newIndex++;
			}
		}
		System.out.println(
				"Array after placing zero  after each triple which in sequence :" + 
		"\n"+Arrays.toString(output));

	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		Place_SumZero_Triplets place = new Place_SumZero_Triplets();
		System.out.println("Given array is:" + Arrays.toString(input) + "\n");
		place.getSumOfTriplets(input);
		place.getZeroAfterTriplets(input);
	}

}
