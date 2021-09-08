package nasir_Assignment_30;

public class PalindromeNumber {
	boolean isNumberPalindrome(int num) {
		int reverseNumber = 0;
		int originalNumber = num;
		while(num > 0) {
			int remainder = num % 10;
			reverseNumber = reverseNumber*10+remainder;
			num = num/10;
		}
		if(originalNumber == reverseNumber)
			return true;
		else
			return false;
	}
	void displayResult(int num) {
		if(isNumberPalindrome(num))
			System.out.println(num + " is palindrome");
		else
			System.out.println(num + " is not palindrome");
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		palindromeNumber.displayResult(12321);
		palindromeNumber.displayResult(123);

	}

}
