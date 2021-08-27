package madhavi;

import java.util.Arrays;

public class Assignment_18_1 {
	String getReverseString(String input) {
		String output = "";

		for (int index = input.length() - 1; index >= 0; index--) {

			output = output + input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringArayAtReversePlace(String[] input) {

		String[] output = new String[input.length];
		int temp = 0;

		for (int index = input.length - 1; index >= 0; index--) {
			output[temp] = getReverseString(input[index]);
			temp++;
		}

		return output;
	}

	public static void main(String[] args) {

		Assignment_18_1 assignment_18_1 = new Assignment_18_1();

		System.out.println("Original String array :");
		String[] input = { "techno", "credits", "krishna", "harsh" };
		System.out.println(Arrays.toString(input));

		String[] output = assignment_18_1.getReverseStringArayAtReversePlace(input);
		System.out.println("Reverse representation of string array at reverse position :");
		System.out.println(Arrays.toString(output));

	}
}
