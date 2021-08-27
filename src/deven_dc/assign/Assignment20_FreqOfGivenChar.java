package deven_dc.assign;

import java.util.Scanner;

public class Assignment20_FreqOfGivenChar {

	void getFreqOfGivenCharFromString(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("The Count of Char '" + ch + "' in Given String " + input + " - " + count);
	}

	void getFreqOfEachCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (index == input.indexOf(input.charAt(index)))
				getFreqOfGivenCharFromString(input, input.charAt(index));
		}
	}

	void getFreqOfUniqueCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
				getFreqOfGivenCharFromString(input, input.charAt(index));
		}
	}

	void getFreqOfDuplicateCharFromString(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.lastIndexOf(input.charAt(index)) > input.indexOf(input.charAt(index))) {
				if (index == input.indexOf(input.charAt(index)))
					getFreqOfGivenCharFromString(input, input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		Assignment20_FreqOfGivenChar assignment_20 = new Assignment20_FreqOfGivenChar();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String input = scanner.nextLine();
		System.out.println("Enter a char");
		char ch = scanner.nextLine().charAt(0);
		assignment_20.getFreqOfGivenCharFromString(input, ch);
		System.out.println("Enter String");
		assignment_20.getFreqOfEachCharFromString(scanner.nextLine());
		System.out.println("Enter String");
		assignment_20.getFreqOfUniqueCharFromString(scanner.nextLine());
		System.out.println("Enter String");
		assignment_20.getFreqOfDuplicateCharFromString(scanner.nextLine());
	}
}
