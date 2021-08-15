package neha;

//start index is completely configurable for both logic and is passed by user
public class WhileLoopAssignment11 {
	// find first N prime numbers
	void findPrimeNumber(int primeCount, int number) {
		int count = 0;
		System.out.println("First " + primeCount + " prime numbers starting from number " + number + " are:");
		while (count < primeCount) {
			if (number != 0 && number != 1) {
				if (verifyPrimeNumber(number)) {
					System.out.println(number);
					count++;
				}
			}
			number++;
		}
	}

	Boolean verifyPrimeNumber(int number) {
		Boolean status = true;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				status = false;
				break;
			}
		}
		if (status)
			return status;
		else
			return false; // returning false in case number is not prime

	}

	// method to find out required numbers to generate sum more than 100
	void findNumbersToGetRequiredSum(int reqSum, int startIndex) {
		System.out.println("\r\nFor index starting with number " + startIndex
				+ ", count of numbers required to generate sum more than " + reqSum + " is:");
		int sum = 0;
		int count = 0;
		while (sum <= reqSum) {
			sum = sum + startIndex;
			count++;
			startIndex++;
		}
		System.out.print(count);

	}

	public static void main(String[] args) {
		WhileLoopAssignment11 whileLoopAssignment11 = new WhileLoopAssignment11();
		// provide required count for prime numbers and start index
		whileLoopAssignment11.findPrimeNumber(15, 0);
		// provide required sum and start index
		whileLoopAssignment11.findNumbersToGetRequiredSum(100, 3);
	}

}
