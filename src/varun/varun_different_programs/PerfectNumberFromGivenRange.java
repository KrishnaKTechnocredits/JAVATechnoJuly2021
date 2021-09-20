package varun.varun_different_programs;

public class PerfectNumberFromGivenRange {
	void perfectNumberInGivenRange(int startRange, int endRange) {

		boolean isPerfectNumber = false;

		for (int index = startRange; index <= endRange; index++) {
			if (isPerfectNumber(index)) {
				System.out.println(index);
				isPerfectNumber = true;
			} else
				continue;
		}

		if (!isPerfectNumber)
			System.out.println("No perfect numbers in the range");

	}

	boolean isPerfectNumber(int number) {
		int sumOfDivisibles = 0;

		for (int index = 1; index <= number / 2; index++) {
			if (number % index == 0) {
				sumOfDivisibles += index;
			}
		}

		if (sumOfDivisibles == number)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		PerfectNumberFromGivenRange perfectNumberFromGivenRange = new PerfectNumberFromGivenRange();
		perfectNumberFromGivenRange.perfectNumberInGivenRange(6, 170);
	}
}
