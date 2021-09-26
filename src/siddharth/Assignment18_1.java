package siddharth;

import java.util.Arrays;

public class Assignment18_1 {
	String getReverseString(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output = output + str.charAt(index);
		}
		return output;
	}

	String[] reverStringArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = getReverseString(input[index]);
		}
		return input; 
	}

	public static void main(String[] a) {
		String[] input = { "Mahi", "jiten", "Sid", "Him" };
		Assignment18_1 assingment18_1 = new Assignment18_1();
		String[] revinput = assingment18_1.reverStringArray(input);
		System.out.println(Arrays.toString(revinput));
	}
}
