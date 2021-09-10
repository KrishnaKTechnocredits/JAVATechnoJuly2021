package shantanu.stringAndNumberPalindrom_assignment29;

public class StringPalindromeWithReverse {
	boolean isStringPalindrome(String str) {
		String reverseStr = "";
		for(int index = str.length()-1; index >=0; index--)
			reverseStr += str.charAt(index);
		if(str.equals(reverseStr))
			return true;
		else
			return false;
	}
	void displayResult(String str) {
		if(isStringPalindrome(str))
			System.out.println(str+" is palindrome!");
		else
			System.out.println(str+" is not palindrome!");
	}
	public static void main(String[] args) {
		StringPalindromeWithReverse stringPalindromeWithReverse = new StringPalindromeWithReverse();
		stringPalindromeWithReverse.displayResult("malayalam");
	}
}
