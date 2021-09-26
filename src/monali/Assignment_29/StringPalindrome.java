package monali.Assignment_29;

import java.util.Scanner;

public class StringPalindrome {

	String strPalindromeWithReverse(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	boolean strPalindromeWithoutReverse(String input) {

		boolean flag = false;
		for (int index = 0; index < input.length() - 1; index++) {
			if (input.charAt(index) == input.charAt(input.length() - index - 1))
				flag = true;
			else
				break;
		}
		return flag;
	}

	void displayPalindromeResult(String input, String output) {
		if (output.equals(input))
			System.out.println(input + "  is palindrome");
		else
			System.out.println(input + "  is not palindrome");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String to check palindrome : ");
		String input = sc.next();
		String inputLowerCase = input.toLowerCase();

		StringPalindrome strPalindrome = new StringPalindrome();
		String outputReverse = strPalindrome.strPalindromeWithReverse(inputLowerCase);
		strPalindrome.displayPalindromeResult(inputLowerCase, outputReverse);
		boolean flag = strPalindrome.strPalindromeWithoutReverse(inputLowerCase);
		if (flag) {
			System.out.println(inputLowerCase + " string is palindrome");
		} else
			System.out.println(inputLowerCase + " string not palindrome");

		sc.close();

	}
}
