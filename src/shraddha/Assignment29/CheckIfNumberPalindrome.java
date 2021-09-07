package shraddha.Assignment29;

public class CheckIfNumberPalindrome {
	public static void main(String[] args) {
		int number = 6778;
		CheckIfNumberPalindrome newObject = new CheckIfNumberPalindrome();
		System.out.println("Given number is :- " + number);
		if (newObject.ifNumberPalindrome(number))
			System.out.println("This Number is a palindrome Number");
		else
			System.out.println("This Number is NOT a palindrome Number");
	}

	// this method will check if given number is Palindrome or not
	boolean ifNumberPalindrome(int number) {
		int sum = 0;
		int temp = number;
		int remainder;

		while (number > 0) {
			remainder = number % 10; // getting remainder
			sum = (sum * 10) + remainder;
			number = number / 10;
		}

		if (temp == sum)
			return true;
		else
			return false;
	}
}
