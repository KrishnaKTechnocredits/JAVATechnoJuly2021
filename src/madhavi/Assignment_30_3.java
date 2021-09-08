package madhavi;

public class Assignment_30_3 {
	void checkPallindromeNumber(int number) {
		int temp = number;
		int reverseNo = 0;
		while (number > 0) {
			int digit = number % 10;
			reverseNo = reverseNo * 10 + digit;
			number = number / 10;
		}
		if (temp == reverseNo) {
			System.out.println(temp + " is palindrome number!");
		} else {
			System.out.println(temp + " is not a palindrome number!");
		}
	}

	public static void main(String[] args) {
		Assignment_30_3 assignment_30_3 = new Assignment_30_3();
		System.out.println(".....Verify given number is an Palindrome number.....");
		int input = 12321;
		assignment_30_3.checkPallindromeNumber(input);
		int input1 = 123;
		assignment_30_3.checkPallindromeNumber(input1);
	}
}
