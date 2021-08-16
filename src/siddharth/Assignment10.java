package siddharth;

public class Assignment10 {
	int count;
	int average;
	int primesum;

	void verifyNumberIsPrime(int number) {
		int status = 0;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = 1;
				// System.out.println("Number is not prime" + number);
				break;
			}
		}
		if (status == 0) {
			System.out.println(number + "Number is prime");
			count = count + 1;
			primesum = primesum + number;
			average = primesum / count;
		}
	}

	void printPrimeNumbersInRange(int startNumber, int endNumber) {
		for (int number = startNumber; number <= endNumber; number++) {
			verifyNumberIsPrime(number);

		}

	}

	void printTotalCountOfPrimeNumbersInRange() {
		System.out.println("Count of Prime number is: " + count);
	}

	void sumOfPrimeNumbersInRange() {
		System.out.println("Sum of Prime numbers: "+ primesum);
	}

	void average() {
		System.out.println("Average of Prime numbers is: " + average);
	}

	public static void main(String[] a) {
		Assignment10 assignment10 = new Assignment10();
		// assignment10.verifyNumberIsPrime(113);
		assignment10.printPrimeNumbersInRange(100, 120);
		assignment10.printTotalCountOfPrimeNumbersInRange();
		assignment10.sumOfPrimeNumbersInRange();
		assignment10.average();

	}
}
