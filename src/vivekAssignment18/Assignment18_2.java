package vivekAssignment18;

import java.util.Arrays;

public class Assignment18_2 {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] reverseArray(String[] input) {
		String output[] = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[input.length - index - 1] = reverseString(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment18_2 assignment18_2 = new Assignment18_2();
		String[] input = { "techno", "credits", "krishna", "harsh" };
		assignment18_2.reverseArray(input);
		System.out.println(Arrays.toString(assignment18_2.reverseArray(input)));
	}
}
