package aniket;

import java.util.Arrays;

public class ReverseArrayElements {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;

	}

	String[] reverseArrayElements(String[] input) {
	//	String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			input[index] = reverseString(input[index]);

		}
		return input;

	}

	public static void main(String[] args) {
		String name = "technocredits";
		String[] input = { "Madhavi", "Surbhi", "Neha", "Sandesh", "Aniket", "vaibhav" };
		ReverseArrayElements reversestring = new ReverseArrayElements();
		System.out.println(reversestring.reverseString(name));
		// System.out.println(reversestring.getReverseStringArray(input));
		System.out.println(Arrays.toString(reversestring.reverseArrayElements(input)));
	}

}
