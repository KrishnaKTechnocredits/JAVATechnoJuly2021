package indu_Assignment_29;

public class IsNumberPalindrome {
	boolean isNumberPalindrome(int input) {

		int remainder = 0;
		int number = input;

		while (number > 0) 
		{
			remainder = remainder * 10 + number % 10;
			number = number / 10;
		}
		
		if (remainder == input)
			return true;
		else
			return false;

	}
	void displayIsPalindrome(int input)
	{
		if(isNumberPalindrome(input))
			System.out.println(input + " is Palindrome...!!");
		else
			System.out.println(input + " is not a Palindrome...!!");
	}
	public static void main(String[] args) {
		IsNumberPalindrome isNumberPalindrome = new IsNumberPalindrome();
		isNumberPalindrome.displayIsPalindrome(121);
		isNumberPalindrome.displayIsPalindrome(112);
		isNumberPalindrome.displayIsPalindrome(112211);
		isNumberPalindrome.displayIsPalindrome(95959);
	}
}
