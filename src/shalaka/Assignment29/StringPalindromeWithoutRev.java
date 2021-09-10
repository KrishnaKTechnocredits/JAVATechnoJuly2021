/*program 2: String Pallindrome by without writing reverse method logic.
 String input = "naman";
 String input = "aabbaa";*/
package shalaka.Assignment29;

public class StringPalindromeWithoutRev {
	boolean isPalindrome = false;

	boolean isPalindrome(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (index >= (input.length() - index))
				break;
			if (input.charAt(index) == input.charAt(input.length() - 1 - index))
				isPalindrome = true;
			else
				isPalindrome = false;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabbaa";
		StringPalindromeWithoutRev stringPalindromeWithoutRev = new StringPalindromeWithoutRev();
		boolean isPalindrome = stringPalindromeWithoutRev.isPalindrome(input);
		System.out.println(input+" is Palindrome");
	}

}
