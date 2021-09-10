package akanksha_Jain.Assignment_30;

public class Program_3_PallindromeNumber {
	
	int isNumberPallindrome(int number) {
		int rNumber = 0, remainder;
		while(number > 0) {
			remainder = number % 10;
			rNumber = rNumber * 10 + remainder;
			number = number / 10;
		}
		return rNumber;
	}
	
	void displayPallindromeResult(int number) {
		if(isNumberPallindrome(number)==number)
			System.out.println(number + " is pallindrome number.");
		else
			System.out.println(number + " is not a pallindrome number.");
	}
	
	public static void main(String[] args) {
		int number = 12321;
		Program_3_PallindromeNumber pNumber = new Program_3_PallindromeNumber();
		pNumber.displayPallindromeResult(number);
	}
}