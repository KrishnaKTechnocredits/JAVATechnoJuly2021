package varun_string_assignment;

import java.util.Arrays;

public class ReverseStringInReverseOrder {
	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] reverseStringInReverseOrder(String[] input) {
		String[] output = new String[input.length];
		int count = input.length - 1;
		for (int index = 0; index <= input.length - 1; index++) {
			output[index] = getReverseString(input[count]);
			count--;
		}
		return output;
	}

	void displayArray(String[] output) {
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		ReverseStringInReverseOrder reverseStringInReverseOrder = new ReverseStringInReverseOrder();
		String[] input = { "techno", "credits", "krishna", "harsh" };
		String[] output = reverseStringInReverseOrder.reverseStringInReverseOrder(input);
		System.out.println("Elements of array in reverse order from given string are : ");
		reverseStringInReverseOrder.displayArray(output);
	}
}
