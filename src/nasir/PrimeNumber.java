package nasir;

public class PrimeNumber {
	int count;
	int sum;

	public void numberIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				// System.out.println(number + " number is not prime");
				break;

			}
		}
		if (status) {
			System.out.println(number + " number is prime");
			count = count + 1;
			sum = sum + number;

		}
	}

	public void primeNumeberInRange(int startNumber, int endNumber) {
		for (int number = startNumber; number <= endNumber; number++) {
			numberIsPrime(number);

		}

	}

	public void countOfPrimeNumber() {

		System.out.println("Count of the prime number is " + count);

	}

	public void sumOfPrimeNumber() {

		System.out.println("Sum of the prime number is " + sum);

	}

	public void averageOfPrimeNumber() {
		double avgPrime = sum / count;
		System.out.println("Average of the prime number is " + avgPrime);

	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.numberIsPrime(100);
		primeNumber.primeNumeberInRange(100, 120);
		primeNumber.countOfPrimeNumber();
		primeNumber.sumOfPrimeNumber();
		primeNumber.averageOfPrimeNumber();

	}

}
