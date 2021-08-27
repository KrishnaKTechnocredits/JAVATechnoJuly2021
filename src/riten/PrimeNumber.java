package riten;

class PrimeNumber {

	int count;
	int sum;
	float avg;

	void checkPrimeNumber(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				// System.out.println(number+" is not prime");
				break;
			}
		}
		if (status) {
			System.out.println(number + " is prime numbers");
			count++;
			sum = sum + number;
			avg = sum / count;
		}
	}

	void checkPrimeInRange(int startNumber, int endNumber) {
		for (int number = startNumber; number <= endNumber; number++) {
			checkPrimeNumber(number);
		}

	}

	void countOfPrimeNumber() {
		System.out.println("Total prime numbers are : " + count);

	}

	void sumOfPrimeNumber() {
		System.out.println("Sum of prime numbers are : " + sum);

	}

	void avgOfPrimeNumber() {
		System.out.println("avg of prime numbers are : " + avg);

	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.checkPrimeInRange(10, 25);
		primeNumber.countOfPrimeNumber();
		primeNumber.sumOfPrimeNumber();
		primeNumber.avgOfPrimeNumber();

	}

}