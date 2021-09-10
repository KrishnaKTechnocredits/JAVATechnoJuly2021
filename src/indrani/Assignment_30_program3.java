package indrani;

public class Assignment_30_program3 {
	
	void palindromeNumber(int number) {
		int temp = number;
		int reverseNum = 0;
		while (number > 0) {
			int digit = number % 10;
			reverseNum = reverseNum * 10 + digit;
			number = number / 10;
		}
		if (temp == reverseNum) {
			System.out.println(temp + " is palindrome number ");
		} else {
			System.out.println(temp + " is not a palindrome number ");
		}
	}

	public static void main(String[] args) {
		Assignment_30_program3 program3 = new Assignment_30_program3();
		int input1 = 12321;
		program3.palindromeNumber(input1);
		int input2 = 123;
		program3.palindromeNumber(input2);
	}
}
