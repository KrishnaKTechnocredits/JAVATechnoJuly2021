package parthav.parthavD_Assignment_30;

public class ReverseNumber {

	int reverseNumber(int inputNumber) {
		int reversedNumber = 0;
		int remainder = 0;

		while (inputNumber > 0) {
			remainder = inputNumber % 10;
			reversedNumber = (reversedNumber + remainder) * 10;
			inputNumber /= 10;
		}

		return (reversedNumber / 10);

	}

	void printReversedNumber(int number) {
		System.out.println("The reversed number of " + number + " is " + reverseNumber(number));
	}

	void checkArmstrongNumber(int inputNumber) {
		int remainder = 0;
		int sumofCubes = 0;
		int tempNumber = inputNumber;

		while (inputNumber > 0) {
			remainder = inputNumber % 10;
			sumofCubes += (remainder * remainder * remainder);
			inputNumber /= 10;
		}

		if (sumofCubes == tempNumber)
			System.out.println("The number " + tempNumber + " is an Armstrong number");
		else
			System.out.println("The number " + tempNumber + " is not an Armstrong number");

	}

	void verifyPalindromeNumber(int number) {
		int reversedNumber = reverseNumber(number);
		if (number == reversedNumber)
			System.out.println("The number " + number + " is a Palindrome number");
		else
			System.out.println("The number " + number + " is not a Palindrome number");
	}

	public static void main(String[] args) {
		ReverseNumber newObject = new ReverseNumber();
		newObject.printReversedNumber(1932);
		newObject.printReversedNumber(4913);
		newObject.checkArmstrongNumber(153);
		newObject.checkArmstrongNumber(154);
		newObject.verifyPalindromeNumber(12321);
		newObject.verifyPalindromeNumber(12001);

	}

}