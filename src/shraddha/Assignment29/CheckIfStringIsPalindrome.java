/* Program 1 : String palindrome by writing reverse method logic.
 String input = "naman";*/

package shraddha.Assignment29;

public class CheckIfStringIsPalindrome {
	public static void main(String[] args) {
		String input = "naman";
		CheckIfStringIsPalindrome newObject = new CheckIfStringIsPalindrome();
		System.out.println("Input String is :- " + input);
		if (newObject.isStringPalindrome(input))
			System.out.println("Input String is Palindrome");
		else
			System.out.println("Input String is NOT a Palindrome");
	}

	// this method will check if the given String is palindrome using String reverse
	// method
	boolean isStringPalindrome(String inputString) {
		boolean isPalindrome = false;
		String reverseString = "";
		for (int index = inputString.length() - 1; index >= 0; index--) {
			reverseString = reverseString + inputString.charAt(index);
		}
		System.out.println("reverse String is :- " + reverseString);
		if (inputString.equalsIgnoreCase(reverseString))
			isPalindrome = true;
		return isPalindrome;
	}
}
