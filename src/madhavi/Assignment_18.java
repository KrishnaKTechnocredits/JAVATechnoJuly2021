package madhavi;

import java.util.Arrays;

public class Assignment_18 {

	String getReverseString(String input) {
		String output = "";

		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}

		return output;
	}

	String[] getReverseStringArayAtSamePlace(String[] input) {

		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {

			output[index] = getReverseString(input[index]);
		}

		return output;
	}

	public static void main(String[] args) {
		Assignment_18 assignment_18 = new Assignment_18();

		System.out.println("Original String array :");
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println(Arrays.toString(input));

		String[] output = assignment_18.getReverseStringArayAtSamePlace(input);
		System.out.println("Reverse representation of string array at same position :");
		System.out.println(Arrays.toString(output));
	}
}