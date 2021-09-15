package umakant;

public class Assignment30 {

	int reverseNumber(int input) {
		int reverseNumber = 0;
		while (input != 0) {
			reverseNumber = (reverseNumber * 10) + (input % 10);
			input = input / 10;
		}
		return reverseNumber;
	}

	private boolean isPalindromeNumber(int input) {
		return input == reverseNumber(input);
	}

	private boolean isArmstrongNumber(int input) {
		int answer = 0;
		int temp = input;
		while (temp != 0) {
			int rem = temp % 10;
			answer += (rem * rem * rem);
			temp = temp / 10;
		}
		return answer == input;
	}

	private boolean isPerfectNumber(int input) {
		int answer = 0;
		for (int index = 1; index <= input / 2; index++) {
			if (input % index == 0)
				answer += index;
		}
		return answer == input;
	}

	void displayPalindromeNumber(int input) {
		if (isPalindromeNumber(input))
			System.out.println(input + " is a palindrome number");
		else
			System.out.println(input + " is not a palindrome number");
	}

	void displayArmstrongNumber(int input) {
		if (isArmstrongNumber(input))
			System.out.println(input + " is a Armstrong number");
		else
			System.out.println(input + " is not a Armstrong number");
	}

	void displayPerfectNumber(int input) {
		if (isPerfectNumber(input))
			System.out.println(input + " is a perfect number");
		else
			System.out.println(input + " is not a perfect number");
	}

	public static void main(String[] args) {
		Assignment30 assignment30 = new Assignment30();
		int input = 1932;
		System.out.println("Reverse of "+input+" is :"+assignment30.reverseNumber(input));
		assignment30.displayArmstrongNumber(153);
		assignment30.displayPalindromeNumber(12321);
		assignment30.displayArmstrongNumber(151);
		assignment30.displayPalindromeNumber(123);
		assignment30.displayPerfectNumber(28);
		assignment30.displayPerfectNumber(14);
	}
}
