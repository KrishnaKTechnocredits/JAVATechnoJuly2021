package bhagyashree;

public class Assignment30 {

	// to get reverse number of given number
	int getReverseNumber(int number) {
		int reverse = 0, rem = 0;
		while (number > 0) {
			rem = number % 10;
			reverse = (reverse * 10) + rem;
			number = number / 10;
		}
		// System.out.println("Number after reverse: "+reverse);
		return reverse;
	}

	// verify given number is armstrong or not

	void verifyGivenIsArmstrong(int number) {
		int temp = number;
		int rem, num = 0;
		while (number > 0) {
			rem = number % 10;
			num = num + (rem * rem * rem);
			number = number / 10;
		}
		if (temp == num) {
			System.out.println(temp + " is armstorng number");
		}

		else {
			System.out.println(temp + " is not armastrong number");
		}

	}

	// verify the number is palindrome or not

	void findNumberIsPalindrome(int input) {
		if (input == getReverseNumber(input)) {
			System.out.println(input + " is palindrome");
		} else {
			System.out.println(input + " is not palindrome");
		}
	}

	// verify the given number is perfect or not
	void findGivenNumberIsPerfect(int number) {
		int sum = 0;
		for (int index = 1; index < number; index++) {
			if (number % index == 0) {
				sum += index;
			}
		}
		if (sum == number) {
			System.out.println(number + " is Perfect number");

		} else
			System.out.println(number + " is not perfect number");
	}

	public static void main(String[] args) {
		Assignment30 ass30 = new Assignment30();
		System.out.println("NUmber after revese: " + ass30.getReverseNumber(1932));

		ass30.verifyGivenIsArmstrong(153);

		ass30.findNumberIsPalindrome(151);

		ass30.findGivenNumberIsPerfect(28);
	}
}
