package madhavi;

public class Assignment_10 {
	int primeSum = 0;
	int count = 0;
	int primeAvg;

	void verifyPrimeNumber(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				// System.out.println(number + " is not prime");
				break;
			}
		}

		if (status) {
			System.out.println(number + " is prime number.");
			primeSum = primeSum + number;
			count = count + 1;
		}
	}

	void primeNumberRange(int startNumber, int endNumber) {
		for (int number = startNumber; number <= endNumber; number++) {
			verifyPrimeNumber(number);
		}
	}

	void verifyPrimeNumberCount() {
		System.out.println("The total prime number count: " + count);
	}

	void verifySumPrimeNumber() {
		System.out.println("The sum of prime number: " + primeSum);
	}

	void verifyAvgPrimeNumber() {
		primeAvg = primeSum / count;
	}

	void avgPrimeNumber() {
		primeAvg = primeSum / count;
		System.out.println("An average of prime number: " + primeAvg);
	}

	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10();
		System.out.println("Display all the prime numbers between 80 to 100 :");
		assignment_10.primeNumberRange(80, 100);
		System.out.println("-----------------------------------------------");
		assignment_10.verifyPrimeNumberCount();
		assignment_10.verifySumPrimeNumber();
		assignment_10.avgPrimeNumber();

	}

}
