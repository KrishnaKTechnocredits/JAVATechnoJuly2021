package parthav.parthavD_Assignment29;

public class PalindromeWithoutReverse {

	private boolean isPalindrome(String inputString) {
		inputString = inputString.toLowerCase();
		int midIndex = inputString.length() / 2;
		int strLength = inputString.length();
		boolean isPalindrome = true;

		if (midIndex / 2 == 0) {
			for (int index = 0; index <= midIndex - 1; index++) {
				if (inputString.charAt(index) != inputString.charAt(strLength - 1)) {
					isPalindrome = false;
					break;
				} else
					strLength--;

			}
		} else {

			for (int index = 0; index < midIndex; index++) {
				if (inputString.charAt(index) != inputString.charAt(strLength - 1)) {
					isPalindrome = false;
					break;
				} else
					strLength--;
			}
		}

		return isPalindrome;

	}

	void displayPalindrome(String inputString) {
		if (isPalindrome(inputString))
			System.out.println("The string " + inputString + " is a Palindrome string");
		else
			System.out.println("The string " + inputString + " is not a Palindrome string");
	}

	public static void main(String[] args) {
		PalindromeWithoutReverse newObject = new PalindromeWithoutReverse();
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
