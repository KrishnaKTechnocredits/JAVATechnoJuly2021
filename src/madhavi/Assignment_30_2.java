package madhavi;

public class Assignment_30_2 {

	void checkArmstrongNumber(int number) {
		int originalNumber, remainder, result = 0;

		originalNumber = number;

		while (originalNumber != 0) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, 3);
			originalNumber /= 10;
		}

		if (result == number)
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");
	}

	public static void main(String[] args) {
		Assignment_30_2 assignment_30_2 = new Assignment_30_2();
		System.out.println(".....Verify whether given number is Armstrong number.....");
		int input = 153;
		assignment_30_2.checkArmstrongNumber(input);

	}
}