package husain;

import java.util.Arrays;

public class Assignment_18 {

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
		// TODO Auto-generated method stub
		Assignment_18 obj = new Assignment_18();
		String input[] = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println("The array in which string values are to be reversed is: " + Arrays.toString(input));
		obj.printArrayWithReversedString(input);
		System.out.println("The array with reversed string values are: " + Arrays.toString(input));

		String arr[] = { "techno", "credits", "krishna", "harsh" };
		System.out.println(
				"\n\nThe array in which both array and string values are to be reversed is: " + Arrays.toString(arr));
		String outputArr[] = obj.printReversedArray(arr);
		System.out.println("The reversed array with reversed string values are: " + Arrays.toString(outputArr));

	}

}
