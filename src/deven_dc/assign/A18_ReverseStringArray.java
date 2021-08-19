package deven_dc.assign;

import java.util.Arrays;

public class A18_ReverseStringArray {
	String printReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--)
			output = output + input.charAt(index);
		return output;
	}

	String[] printArrayWithReversedString(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = printReverseString(input[index]);
		}
		return input;
	}

	String[] printReversedArray(String[] input) {
		String output[] = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[(input.length - 1) - index] = printReverseString(input[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		A18_ReverseStringArray obj = new A18_ReverseStringArray();
		String input[] = { "Madhvi", "Surbhi", "Neha", "Sandesh", "Ankit", "Vaibhav" };
		System.out.println("The Array in String Values - " + Arrays.toString(input));
		obj.printArrayWithReversedString(input);
		System.out.println("The Array with Reversed String values - " + Arrays.toString(input));
		System.out.println("          ------------------------------          ");
		String arr[] = { "Techno", "Credits", "Krishna", "Harsh" };
		System.out.println("The Array in Both Array & String Values - " + Arrays.toString(arr));
		String outputArr[] = obj.printReversedArray(arr);
		System.out.println("The Reversed Array with Reversed String Values - " + Arrays.toString(outputArr));
	}
}
