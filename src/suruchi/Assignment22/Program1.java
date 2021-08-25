package suruchi.Assignment22;

import java.util.Scanner;

public class Program1 {

	void getTotalDigitsInString(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				count++;
		}
		System.out.println("Total digits in given string are: " + count);
	}

	void getSumOfDigitsInString(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				sum += Character.getNumericValue(input.charAt(index));
		}
		System.out.println("Sum of all digits in given string is: " + sum);
	}

	public static void main(String[] args) {
		Program1 program1 = new Program1();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word:");
		String str = scanner.next();

		program1.getTotalDigitsInString(str);

		System.out.println();
		System.out.println("Enter another word:");
		String str1 = scanner.next();

		program1.getSumOfDigitsInString(str1);

		scanner.close();
	}
}