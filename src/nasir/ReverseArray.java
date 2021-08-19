package nasir;

import java.util.Arrays;

public class ReverseArray {
	String printReverse(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);

		}
		return output;
	}

	String[] printReverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = printReverse(input[index]);
		}
		return output;
	}

	String[] getReverseElementAtReverseOrder(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[(input.length - 1) - index] = printReverse(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseArray reverseArray = new ReverseArray();
		// System.out.println(reverseArray.printReverse("madhivi"));
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		String[] output = reverseArray.printReverseArray(input);
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index]);

		}
		String[] input1 = { "techno", "credits", "krishna", "harsh" };
		System.out.println(Arrays.toString(reverseArray.getReverseElementAtReverseOrder(input1)));

	}

}
