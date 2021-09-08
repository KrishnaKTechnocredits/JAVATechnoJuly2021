package mratunjay.Assignment_12_To_18;

import java.util.Arrays;

public class Assignment_18 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	String[] getReverseOfArrayAtSamePosition(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = getReverseString(input[index]);
		}
		return input;
	}

	String[] getReverseElementAtReverseOrder(String[] input) {
		String[] output = new String[input.length];
		int rev = input.length -1;
		for (int index = 0 ; index < input.length; index++) {
			output[rev] = getReverseString(input[index]);
			rev--;
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		Assignment_18 assignment_18 = new Assignment_18();
		System.out.print("Reverse all elements of an array at same position is ");
		System.out.println(Arrays.toString(assignment_18.getReverseOfArrayAtSamePosition(input)));
		String[] input1 = { "techno", "credits", "krishna", "harsh" };
		System.out.print("Reverse all elements of an array and place it in a reverse order is ");
		System.out.println(Arrays.toString(assignment_18.getReverseElementAtReverseOrder(input1)));
	}
}
