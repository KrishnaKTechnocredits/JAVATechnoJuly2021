package pranita;

public class Assignment_10{
	int sum;
	int primecount;
	int average;

	void numberIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index <=number-1; index++) {
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
			numberIsPrime(number);
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
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.numberIsPrime(16);
		assignment_10.primeNumberRange(100, 120);
		assignment_10.averageOfPrimeNumber();
		assignment_10.sumOfPrimeNumber();
		assignment_10.primeNumberCount();
	}
}