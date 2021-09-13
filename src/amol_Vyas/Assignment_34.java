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

package amol_Vyas;

import java.util.Arrays;

public class Assignment_34 {

	static void getFirstNonRepitativeVowelFromString(String input) {
		int strLength = 0;
		while (input.length() > 0) {
			input = input.replace(String.valueOf(input.charAt(0)), "");
			strLength = input.length();
			if (strLength - input.replace(String.valueOf(input.charAt(0)), "").length() == 1) {
				if (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o'
						|| input.charAt(0) == 'u') {
					System.out.println("First non repitative vowel from string is " + input.charAt(0));
					break;
				}
			}
		}
	}

	static int getCountTriplet(int[] input) {
		int count = 0;
		for (int index = 0; index < input.length - 2; index++) {
			if (input[index] == input[index + 1] - 1 && input[index] == input[index + 2] - 2) {
				count++;
			}
		}
		return count;
	}

	static void placeZeroAftereachTriplet(int[] input) {
		int count = Assignment_34.getCountTriplet(input);
		int[] output = new int[input.length + count];
		int outputIndex = 2;
		output[0] = input[0];
		output[1] = input[1];
		for (int index = 2; index < input.length; index++) {
			output[outputIndex] = input[index];
			outputIndex++;
			if (input[index - 2] == input[index] - 2 && input[index - 1] == input[index] - 1) {
				outputIndex++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	static void placeSumAftereachTriplet(int[] input) {
		int count = Assignment_34.getCountTriplet(input);
		int[] output = new int[input.length + count];
		int outputIndex = 2;
		output[0] = input[0];
		output[1] = input[1];
		for (int index = 2; index < input.length; index++) {
			output[outputIndex] = input[index];
			outputIndex++;
			if (input[index - 2] == input[index] - 2 && input[index - 1] == input[index] - 1) {
				output[outputIndex] = input[index - 2] + input[index - 1] + input[index];
				outputIndex++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String input = "aeapquawrpti";
		Assignment_34.getFirstNonRepitativeVowelFromString(input);
		int[] input1 = { 1, 3, 4, 5, 7, 3, 9, 10, 11, 14, 44, 67, 1, 2, 3, 99 };
		Assignment_34.placeZeroAftereachTriplet(input1);
		Assignment_34.placeSumAftereachTriplet(input1);
	}
}
