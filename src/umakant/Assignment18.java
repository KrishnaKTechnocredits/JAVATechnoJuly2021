package umakant;

import java.util.Arrays;

public class Assignment18 {

	String getReverseString(String input) {
		String output = "";
		for (int index = (input.length() - 1); index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	String[] getReverseElementsOfArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = getReverseString(input[index]);
		}
		return input;
	}

	String[] getReverseElementsOfArrayInReverse(String[] input) {
		int length = input.length;
		String[] output = new String[length];
		for (int index = 0; index < length; index++) {
			output[length - 1 - index] = getReverseString(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		String[] input1 = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println(Arrays.toString(assignment18.getReverseElementsOfArray(input1)));
		String[] input2 = { "techno", "credits", "krishna", "harsh" };
		System.out.println(Arrays.toString(assignment18.getReverseElementsOfArrayInReverse(input2)));
	}

}
