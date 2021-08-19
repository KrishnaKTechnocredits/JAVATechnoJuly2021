package varun_string_assignment;

import java.util.Arrays;

public class ReverseAllElementAtSamePosition {
	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] reverseAllElementFromArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = getReverseString(input[index]);
		}
		return input;
	}

	void displayArray(String[] output) {
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		ReverseAllElementAtSamePosition reverseAllElementAtSamePosition = new ReverseAllElementAtSamePosition();
		String[] input1 = { "Varun", "Joshi", "Cybage", "ankit", "vaibhav" };
		String[] output1 = reverseAllElementAtSamePosition.reverseAllElementFromArray(input1);
		System.out.println("Elements of array at same position :");
		reverseAllElementAtSamePosition.displayArray(output1);
	}
}
