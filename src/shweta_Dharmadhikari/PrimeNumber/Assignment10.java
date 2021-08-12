package shweta_Dharmadhikari.PrimeNumber;

public class Assignment10 {
	int count = 0;
	int sum = 0;
	int average = 0;

	void verifyNumberIsPrime(int number) {

		boolean isPrime = true;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(number + " is prime number ");
			count++;
			sum += number;
			average = sum / count;
		}
	}

	void countPrimeNumbers() {
		System.out.println("\nCount of Prime numbers are:" + count);
	}

	void sumOfPrimeNumbers() {
		System.out.println("\nSum of Prime numbers are:" + sum);
	}

	void AverageOfPrimeNumber() {
		System.out.println("\nAverage of Prime numbers are:" + average);
	}

	void verifyNumbersIsPrimeInRange(int startNumber, int endNumber) {
		System.out.println("\nPrime numbers between " + startNumber + " to " + endNumber);
		for (int number = startNumber; number < endNumber; number++) {
			verifyNumberIsPrime(number);

		}
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.verifyNumberIsPrime(17);
		assignment10.verifyNumbersIsPrimeInRange(100, 120);
		assignment10.countPrimeNumbers();
		assignment10.sumOfPrimeNumbers();
		assignment10.AverageOfPrimeNumber();
	}
}