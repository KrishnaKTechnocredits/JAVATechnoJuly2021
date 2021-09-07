package suruchi.Assignment26;

import java.util.Scanner;

public class ReverseString_A26 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	String[] getReverseStringArray(String[] arr) {
		String[] output = new String[arr.length];
		for (int index = arr.length - 1; index >= 0; index--) {
			output[index] = arr[arr.length - index - 1];
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseString_A26 reverseString_A26 = new ReverseString_A26();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Type a sentence:");
		String str = scanner.nextLine();

		System.out.println();
		System.out.println("Sentence displayed in reverse as: " + reverseString_A26.getReverseString(str));

		System.out.println();
		System.out.println("Enter number of elements to be inserted into array: ");
		int totalElements = scanner.nextInt();

		String[] input = new String[totalElements];

		System.out.println("Enter the words to be inserted into the array: ");
		for (int index = 0; index < input.length; index++) {
			input[index] = scanner.next();
		}

		String[] output = reverseString_A26.getReverseStringArray(input);

		System.out.println();
		System.out.print("Array elements displayed in reverse: ");
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}

		scanner.close();
	}
}