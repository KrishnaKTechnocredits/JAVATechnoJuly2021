package shalaka.arrayprograms;

import java.util.Scanner;

public class UniqueChar_Assignment20 {
	void printUniquechar(String input) {
		System.out.println("The unique characters of " + input + " is: ");
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				System.out.println(input.charAt(index));
			}
		}

	}

	public static void main(String[] args) {
		UniqueChar_Assignment20 uniqueChar_Assignment20 = new UniqueChar_Assignment20();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = scanner.next();
		uniqueChar_Assignment20.printUniquechar(input);

		scanner.close();
	}
}
