package siddharth;

import java.util.Arrays;

public class Assignment18_2 {
	String getReverseString(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output = output + str.charAt(index);
		}
		return output;
	}

	String[] reverStringArray(String[] input) {

		for (int index = input.length - 1; index >= 0; index--) {
			input[index] = getReverseString(input[index]);
		}
		return input;
	}

	public static void main(String[] a) {
		String[] input = { "techno", "credits", "krishna", "harsh" };
		Assignment18_2 assignment18_2 = new Assignment18_2();
		String[] revinput = assignment18_2.reverStringArray(input);
		for (int index = input.length - 1; index >= 0; index--)
			System.out.println(revinput[index]);

	}
}
