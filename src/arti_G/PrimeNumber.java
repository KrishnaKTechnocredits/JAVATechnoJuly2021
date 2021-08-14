package arti_G;

//Assignment_10
public class PrimeNumber {

	int numberCount;
	int sum;

	void verifyPrimeNumber(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				System.out.println(number + " is prime");
				status = false;
				break;
			}
		}
		if (status) {
			numberCount++;
			sum = sum + number;
		}
	}

	void verifyAllPrimeNumber(int startNumber, int endNumber) {
		for (int number = startNumber; number <= endNumber; number++) {
			verifyPrimeNumber(number);
		}
	}

	void verifyTotalCountOfPrimeNumbers() {
		System.out.println("Total Count of prime numbers = " + numberCount);
	}

	void sumOfAllPrimeNumbers() {
		System.out.println("Sum of all prime numbers = " + sum);
	}

	void averageOfPrimeNumbers() {
		int average = sum / numberCount;
		System.out.println("Average of prime numbers = " + average);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.verifyPrimeNumber(16);
		primeNumber.verifyAllPrimeNumber(100, 120);
		primeNumber.verifyTotalCountOfPrimeNumbers();
		primeNumber.sumOfAllPrimeNumbers();
		primeNumber.averageOfPrimeNumbers();

	}

}
