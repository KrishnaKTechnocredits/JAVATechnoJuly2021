package vivek;

import java.util.Arrays;

public class Assignment18 {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] reverseArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = reverseString(input[index]);
		}
		return input;
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		assignment18.reverseArray(input);
		System.out.println(Arrays.toString(input));
	}
}
