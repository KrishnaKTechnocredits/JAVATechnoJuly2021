package umakant;

public class Assignment29 {

	void displayPallindromeResult(String input) {
		if (isPalindrome(input))
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}

	void displayPallindromeResult(int input) {
		if (isPalindrome(input))
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}

	boolean isPalindrome(String input) {
		boolean flag = true;
		String temp = input.toLowerCase();
		int length = temp.length();
		for (int index = 0; index < length / 2; index++) {
			if (temp.charAt(index) != temp.charAt(length - index - 1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	boolean isPalindrome(int input) {
		String reverseNumber = "";
		int temp = input;
		while (temp != 0) {
			reverseNumber += (temp % 10);
			temp /= 10;
		}
		return input == Integer.parseInt(reverseNumber);
	}

	String getReverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--)
			output += input.charAt(index);
		return output;
	}

	void isPalindromeUsingReverse(String input) {
		String temp = input.toLowerCase();
		String reverseString = getReverseString(temp);
		if (reverseString.equals(temp))
			System.out.println(input + " is palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		assignment29.isPalindromeUsingReverse("namaN");
		assignment29.isPalindromeUsingReverse("madam");
		assignment29.displayPallindromeResult("abc");
		assignment29.displayPallindromeResult("malayalam");
		assignment29.displayPallindromeResult(16561);
		assignment29.displayPallindromeResult(1656);
	}
}
