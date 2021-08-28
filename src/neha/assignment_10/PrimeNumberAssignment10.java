package neha.assignment_10;

public class PrimeNumberAssignment10 {
	int count = 0;
	int sum = 0;

	void verifyIfNumberIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				break;
			}
		}
		if (status) {
			count++;
			System.out.println(number + " is prime number");
			sum += number;
		}
	}

	void verifyPrimeNumberInRange(int startIndex, int endIndex) {
		System.out.println("Prime numbers in range " + startIndex + ":" + endIndex + " are");
		for (int index = startIndex; index <= endIndex; index++) {
			verifyIfNumberIsPrime(index);
		}
	}

	void CountSumAveragePrimeNumbers() {
		System.out.println("Count of prime numbers is " + count);
		System.out.println("Sum of prime numbers is " + sum);
		System.out.println("Average of prime numbers is " + ((float) sum / count));
	}

	public static void main(String[] args) {
		PrimeNumberAssignment10 primeNumberAssignment10 = new PrimeNumberAssignment10();
		primeNumberAssignment10.verifyPrimeNumberInRange(100, 120);
		primeNumberAssignment10.CountSumAveragePrimeNumbers();
		System.out.println("End");
	}
}
