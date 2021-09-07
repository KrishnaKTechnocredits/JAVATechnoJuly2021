/* program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";*/

package shraddha.Assignment29;

public class CheckStringPalindromeWithoutReverse {
	public static void main(String[] args) {
		String input = "malayalam";
		CheckStringPalindromeWithoutReverse newObject = new CheckStringPalindromeWithoutReverse();
		System.out.println("Input String is :- " + input);
		if (newObject.isStringPalindrome(input))
			System.out.println("Input String is Palindrome");
		else
			System.out.println("Input String is NOT a Palindrome");
	}

	// this method will check if the given String is palindrome by matching each
	// character from start and end of the String
	boolean isStringPalindrome(String inputString) {
		boolean isPalindrome = false;
		int i = 0;
		int j = inputString.length() - 1;
		while (i < j) {
			if (inputString.charAt(i) != inputString.charAt(j)) {
				isPalindrome = false;
				break;
			}
				i++;
				j--;
				isPalindrome = true;			
		}
		return isPalindrome;
	}

}
