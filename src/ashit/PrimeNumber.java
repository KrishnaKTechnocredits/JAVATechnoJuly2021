package ashit;

public class PrimeNumber {
	int sum;
	int primecount;
	int average;

	void verifyNumberIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				System.out.println(number + " is not prime number number");
				break;
			}
		}
		if (status) {
			System.out.println(number + " is prime number");
			sum = sum + number;
			primecount++;
			average = sum / primecount;
		}
	}

	void primeNumberRange(int startIndex, int endIndex) {
		for (int number = startIndex; number < endIndex; number++) {
			verifyNumberIsPrime(number);
		}
	}

	void sumOfPrimeNumber() {
		System.out.println("Sum of Prime number is " + sum);
	}

	void averageOfPrimeNumber() {
		System.out.println("Avearage of Prime number is " + average);
	}

	void primeNumberCount() {
		System.out.println("Count of Prime number is " + primecount);
	}

	public static void main(String[] args) {
		PrimeNumber primenumber = new PrimeNumber();
		primenumber.primeNumberRange(100, 120);
		primenumber.averageOfPrimeNumber();
		primenumber.sumOfPrimeNumber();
		primenumber.primeNumberCount();
	}
}
