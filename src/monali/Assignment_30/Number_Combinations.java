package monali.Assignment_30;

public class Number_Combinations {

	int reverseNumber(int number) {
		int reverseNum = 0;

		while (number > 0) {
			int temp = number % 10;
			reverseNum = reverseNum * 10 + temp;
			number = number / 10;
		}
		return reverseNum;
	}

	private boolean armstrongNumberLogic(int number) {
		int input = number;
		int squCube = 0;
		while (number > 0) {
			int temp = number % 10;
			number = number / 10;
			squCube += (temp * temp * temp);

		}
		if (squCube == input)
			return true;
		else
			return false;
	}

	void verifyArmstrongNumber(int number) {

		if (armstrongNumberLogic(number))
			System.out.println(number + " is armstrong number");
		else
			System.out.println(number + " is not armstrong number");
	}

	private boolean palindromeNumber(int number) {
		int reverseNum = 0;
		int input = number;

		while (number > 0) {
			int temp = number % 10;
			reverseNum = reverseNum * 10 + temp;
			number = number / 10;
		}
		if (input == reverseNum)
			return true;
		else
			return false;
	}

	void verifyPalindromeNumber(int number) {

		if (palindromeNumber(number))
			System.out.println(number + " is palindrome number");
		else
			System.out.println(number + " is not a palindrome number");
	}

	private boolean perfectNumber(int number) {

		int input = number;
		int sum = 0;
		for (int index = 1; index < number; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == input)
			return true;
		else
			return false;
	}

	void verifyPerfectNumber(int number) {

		if (perfectNumber(number))
			System.out.println(number + " is perfect number");
		else
			System.out.println(number + " is not a perfect number");
	}

}
