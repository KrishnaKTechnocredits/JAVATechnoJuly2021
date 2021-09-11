/*
 Assignment - 34 : 11th Sep'2021
program 1 : place 0 after the triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99}; // 11 + 3 = 14
output = [1,3,4,5,0,7,3,9,10,11,0,14,44,67,1,2,3,0,99];

		 
program 2 : place sum of triple after each triple which in sequence.

input = {1,3,4,5,7,3,9,10,11,14,44,67,1,2,3,99};
output = [1,3,4,5,12,7,3,9,10,11,30,14,44,67,1,2,3,6,99];
		 

program 3 : find first non repeating vowel character from given string.
input : aeapquawrpti
output : u
 */
package umakant;

import java.util.Arrays;

public class Assignment34 {

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

	void findFirstNonRepeatingVowel(String word) {
		word = word.toLowerCase();
		while (word.length() > 0) {
			char ch = word.charAt(0);
			int wordLength = word.length();
			word = word.replace(Character.toString(ch), "");
			if ((wordLength - word.length() == 1) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
				System.out.println("First non repeating vowel in string is:" + ch);
				return;
			}
		}
		System.out.println("Non repeating vowels are not present in string");
	}

	public static void main(String[] args) {
		Assignment34 assignment = new Assignment34();
		int[] input1 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		System.out.println(Arrays.toString(assignment.placeZeroAfterTriplet(input1)));
		int[] input2 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		System.out.println(Arrays.toString(assignment.placeTripletSumAfterTriplet(input2)));
		assignment.findFirstNonRepeatingVowel("aeapquawrpti");
	}

}
