package astha.Assignment29;

public class Palindrome {

	void checkPalindrome(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		if (input.equals(output))
			System.out.println(input + " is a palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}

	boolean isPalindrome(String input) {
		boolean flag = false;
		for (int index = 0; index < input.length() / 2; index++)
			if (input.charAt(index) == input.charAt((input.length() - 1) - index))
				flag = true;
			else
				flag = false;

		return flag;
	}

	void displayPalindromeResult(String input) {
		if (isPalindrome(input))
			System.out.println(input + " is a plaindrome");
		else
			System.out.println(input + " is not a palindrome");
	}

	void checkNumberPalindrome(int number) {
		int remainder = 0, sum = 0, temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (sum == temp)
			System.out.println(temp + " is a palindrome");
		else
			System.out.println(temp + " is not a palindrome");

	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.checkPalindrome("naman");
		palindrome.checkPalindrome("astha");
		palindrome.displayPalindromeResult("abha");
		palindrome.displayPalindromeResult("malayalam");
		palindrome.checkNumberPalindrome(12321);
		palindrome.checkNumberPalindrome(2213);
	}
}
