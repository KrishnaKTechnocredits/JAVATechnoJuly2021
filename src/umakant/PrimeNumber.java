package umakant;

public class PrimeNumber {

	int count = 0;
	int sum = 0;

	void isPrimeNumber(int number) {
		boolean flag = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			count++;
			sum += number;
			System.out.println(number + " is prime");
		}

	}

	void primeNumbersInRange(int startIndex, int endIndex) {
		for (int number = startIndex; number <= endIndex; number++)
			isPrimeNumber(number);
	}

	void displayPrimeCount() {
		System.out.println("Prime's number conunt in given range " + count);
	}

	void displayPrimeSum() {
		System.out.println("Prime's number sum in given range " + sum);
	}

	void displayPrimeAverage() {
		System.out.println("Prime's number average in given range " + ((float)sum / count));
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.primeNumbersInRange(100, 120);
		primeNumber.displayPrimeCount();
		primeNumber.displayPrimeSum();
		primeNumber.displayPrimeAverage();
	}

}
