/*
Reverse all elements and place it in a reverse order
*/
package sayali_V;

import java.util.Arrays;

public class Assignment18_2 {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringArray(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			// String rev=reverseString(input[index]);
			output[count] = reverseString(input[index]);
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "Aashvi", "Maulik", "krishna", "techno" };
		Assignment18_2 stringR = new Assignment18_2();
		String[] output = stringR.getReverseStringArray(input);
		System.out.println(
				"Reverse of all elements of an array" + Arrays.toString(input) + " and place it in the reverse order ");
		System.out.println("output:" + Arrays.toString(output));
	}
}
