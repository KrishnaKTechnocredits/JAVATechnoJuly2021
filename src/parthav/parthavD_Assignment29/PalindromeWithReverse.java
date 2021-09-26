package parthav.parthavD_Assignment29;

public class PalindromeWithReverse {
	private boolean isPalindrome(String inputString) {
		inputString = inputString.toLowerCase();
		String reversedString = "";
		for (int index = inputString.length() - 1; index >= 0; index--) {
			String temp = inputString.valueOf(inputString.charAt(index));
			temp = temp.toLowerCase();
			reversedString += temp;
		}
		if (inputString.equals(reversedString))
			return true;
		else
			return false;

	}

	void displayPalindrome(String inputString) {
		if (isPalindrome(inputString))
			System.out.println("The string " + inputString + " is a Palindrome string");
		else
			System.out.println("The string " + inputString + " is not a Palindrome string");
	}

	public static void main(String[] args) {
		PalindromeWithReverse newObject = new PalindromeWithReverse();
		String inputString = "Malayalam";
		newObject.displayPalindrome(inputString);
		inputString = "NotPalindrome";
		newObject.displayPalindrome(inputString);
		inputString = "naman";
		newObject.displayPalindrome(inputString);
		inputString = "aabbaa";
		newObject.displayPalindrome(inputString);

	}

}
