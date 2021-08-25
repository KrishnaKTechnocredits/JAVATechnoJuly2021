
/*
Reverse all elements of an array at the same position
*/
package sayali_V;

import java.util.Arrays;

public class Assignment18_1 {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringArray(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			// String rev=reverseString(input[index]);
			output[index] = reverseString(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "Aashvi", "Maulik", "krishna", "techno" };
		Assignment18_1 stringR = new Assignment18_1();
		String[] output = stringR.getReverseStringArray(input);
		System.out.println("Reverse of all elements of an array" + Arrays.toString(input));
		System.out.println("output:" + Arrays.toString(output));
	}
}
