package poojaJoshi;

public class Assignment_10 {

	int sumPrime;
	int countPrime;
	int avgPrime;

	void verifyPrimeNumber(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				System.out.println(number + " is not prime number");
				break;
			}
		}

		if (status) {
			System.out.println(number + " is prime");
			countPrime = countPrime + 1;
			sumPrime = sumPrime + number;
			avgPrime = avgPrime / countPrime;

		}
	}

	void primeNumberRange(int startNum, int endNum) {
		for (int number = startNum; number <= endNum; number++) {
			verifyPrimeNumber(number);
		}
	}

	void CountOfPrimeNumber() {
		System.out.println("Total prime number count is-> " + countPrime);

	}

	void SumOfPrimeNumber() {
		System.out.println("Total sum of all prime number-> " + sumPrime);

	}

	void AvgPrimeNumber() {
		System.out.println("Total average of prime number-> " + avgPrime);
	}

	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10();
		System.out.println("Find prime nos in range 10 to 50");
		assignment_10.primeNumberRange(10, 50);
		assignment_10.CountOfPrimeNumber();
		assignment_10.SumOfPrimeNumber();
		assignment_10.AvgPrimeNumber();

	}

}
