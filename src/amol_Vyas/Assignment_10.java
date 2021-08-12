package amol_Vyas;

public class Assignment_10 {
	int sum;
	int average;
	int primeCount;

	void isPrimeNumber(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println(number + " is a prime number");
			primeCount++;
			sum += number;
			average = sum / primeCount;
		}
	}

	void printPrimeNumberInRange(int startRange, int endRange) {
		for (int index = startRange; index <= endRange; index++) {
			isPrimeNumber(index);
		}
	}

	void printPrimeNumberCount() {
		System.out.println("Total Number of prime number is " + primeCount);
	}

	void printPrimeNumberSum() {
		System.out.println("Total Sum of prime number is " + sum);
	}

	void printPrimeNumberAverage() {
		System.out.println("Total average of prime number is " + average);
	}

	public static void main(String[] args) {

		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.isPrimeNumber(28);
		assignment_10.printPrimeNumberInRange(100, 120);
		assignment_10.printPrimeNumberCount();
		assignment_10.printPrimeNumberSum();
		assignment_10.printPrimeNumberAverage();

	}

}
