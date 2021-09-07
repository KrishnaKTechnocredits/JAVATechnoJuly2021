package suruchi.Assignment29;

import java.util.Scanner;

public class Palindrome_A29 {

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	boolean isPalindrome(String input) {
		if (input.equalsIgnoreCase(getReverseString(input)))
			return true;
		return false;
	}

	boolean isPalindromeWOReverseMethod(String input) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			if (Character.toLowerCase(input.charAt(index)) == Character.toLowerCase(input.charAt((input.length() - 1) - index)))
				flag = true;
			else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Palindrome_A29 palindrome_A29 = new Palindrome_A29();

		Scanner scanner = new Scanner(System.in);

		char ch = 'Y';

		while (ch == 'Y' || ch == 'y') {
			System.out.println("Checking palindrome using reverse method");
			System.out.println("Enter a word:");
			String input = scanner.next();

			if (palindrome_A29.isPalindrome(input))
				System.out.println("\n" + input + " is a palindrome");
			else
				System.out.println("\n" + input + " is not a palindrome");

			System.out.println("\nChecking palindrome without using reverse method");
			System.out.println("Enter another word:");
			String input2 = scanner.next();

			if (palindrome_A29.isPalindromeWOReverseMethod(input2))
				System.out.println("\n" + input2 + " is a palindrome");
			else
				System.out.println("\n" + input2 + " is not a palindrome");

			System.out.println("\nDo you want to check for palindromes?");
			ch = scanner.next().charAt(0);
			System.out.println();
		}

		scanner.close();
	}
}