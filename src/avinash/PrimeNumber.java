package avinash;

public class PrimeNumber {
	int sum = 0;
	int count = 0;
	float average;

	void verifyNumberisPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				// System.out.println(number+":is not prime number");
				status = false;
				break;
				/*
				 * break statement break the for loop not the if condition so, break statement
				 * cannot be used out side of the for loop
				 */

			}
		}

		if (status) { // if(status==true{
			System.out.println(number + ":is prime");
			count++;
			sum = sum + number;
			average = sum / count;
		}
	}

	void verifyPrimeNumberInRange(int startNumber, int endNumber) {
		for (int number = startNumber; number <= endNumber; number++) {
			verifyNumberisPrime(number);
		}
	}

	void totalCountofPrimeNumbers() {
		System.out.println("Count of total prime number is: " + count);
	}

	void sumofPrimeNumbers() {
		System.out.println("Sum of total prime number is: " + sum);
	}

	void averageofPrimeNumbers() {
		System.out.println("Average of total prime number is: " + average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber primeNumber = new PrimeNumber();
		// primeNumber.verifyNumberisPrime(16);
		primeNumber.verifyPrimeNumberInRange(100, 120);
		System.out.println("********");
		primeNumber.totalCountofPrimeNumbers();
		primeNumber.sumofPrimeNumbers();
		primeNumber.averageofPrimeNumbers();
	}

}
