package shantanu.stringAndNumberPalindrom_assignment29;

public class StringPalindromeWithoutReverse {
	boolean isStringPalindrome(String str) {
		int reverseIndex = str.length()-1;
		boolean flag = true;
		for(int index = 0; index < str.length(); index++) {
			if(str.charAt(index) != str.charAt(reverseIndex)){
				flag = false;
				return flag;
			}
			reverseIndex--;
		}
		return flag;
	}
	void displayResult(String str) {
		if(isStringPalindrome(str))
			System.out.println(str+" is palindrome!");
		else
			System.out.println(str+" is not palindrome!");
	}
	public static void main(String[] args) {
		StringPalindromeWithoutReverse stringPalindromeWithoutReverse = new StringPalindromeWithoutReverse();
		stringPalindromeWithoutReverse.displayResult("naman");
	}
}
