/*Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

		 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
		 

program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u*/

package astha.Assignment34;

import java.util.Arrays;

public class Assignment34 {

	void placeZeroAndSumAfterTriplets(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if ((input[index] == input[index + 1] - 1) && (input[index + 1] == input[index + 2] - 1))
				count++;
		}
		int[] output1 = new int[input.length + count];
		int[] output2 = new int[input.length + count];
		int newIndex = 0;
		for (int index = 0; index <= input.length - 1; index++) {
			if ((index < input.length - 2) && (input[index] == input[index + 1] - 1)
					&& (input[index + 1] == input[index + 2] - 1)) {
				output1[newIndex] = input[index];
				output2[newIndex] = input[index];
				output1[newIndex + 1] = input[index + 1];
				output2[newIndex + 1] = input[index + 1];
				output1[newIndex + 2] = input[index + 2];
				output2[newIndex + 2] = input[index + 2];
				output1[newIndex + 3] = 0;
				output2[newIndex + 3] = input[index] + input[index + 1] + input[index + 2];
				newIndex += 4;
				index += 2;

			} else {
				output1[newIndex] = input[index];
				output2[newIndex] = input[index];
				newIndex++;
			}
		}
		System.out.println("Place zero after triplets");
		System.out.println("Output1 : " + Arrays.toString(output1));
		System.out.println("Place sum of triplets after triplets");
		System.out.println("Output2 : " + Arrays.toString(output2));
	}

	char getNonRepeatingVowel(String input) {
		char nonRepeatingChar = input.charAt(0);
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i'
					|| input.charAt(index) == 'o' || input.charAt(index) == 'u') {
				if ((input.indexOf(input.charAt(index))) == (input.lastIndexOf(input.charAt(index)))) {
					nonRepeatingChar = input.charAt(index);
					break;
				}
			}
		}
		return nonRepeatingChar;

	}

	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		int[] input = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		System.out.println("Input: " + Arrays.toString(input));
		assignment34.placeZeroAndSumAfterTriplets(input);
		System.out.println("The non repeating vowel character in the string is : "
				+ assignment34.getNonRepeatingVowel("aeapquawrpeoti"));

	}

}
