package suruchi;

public class Assignment_10 {

	int startNumber;
	int endNumber;
	int counter;
	int sumOfPrimeNumbers;

	void verifyNumberIsPrime(int number) {
		boolean flag = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				flag = false;
				//not a prime number
				break;
			}
		}
		if (flag) {
			System.out.println(number + " is a prime number");
			counter++;
			sumOfPrimeNumbers = sumOfPrimeNumbers +  number;
		}
	}

	void printPrimeNumbersInRange(int startIndex, int endIndex) {
		startNumber = startIndex;
		endNumber = endIndex;
		System.out.println();
		System.out.println("Verifying prime numbers between " + startIndex + " and " + endIndex + ":");
		for (int number = startIndex; number <= endIndex; number++)
			verifyNumberIsPrime(number);
	}

	void printCountOfPrimeNumbers() {
		System.out.println();
		System.out.println("Count of prime numbers between " + startNumber + " and " + endNumber + " is: " + counter);
	}

	void printSumOfPrimeNumbers() {
		System.out.println();
		System.out.println(
				"Sum of prime numbers between " + startNumber + " and " + endNumber + " is: " + sumOfPrimeNumbers);
	}

	void printAvgOfPrimeNumbers() {
		int average = sumOfPrimeNumbers / counter;
		System.out.println();
		System.out.println(
				"Average of all prime numbers between " + startNumber + " and " + endNumber + " is: " + average);
	}

	public static void main(String[] a) {
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.verifyNumberIsPrime(19);
		assignment_10.printPrimeNumbersInRange(100 , 120);
		assignment_10.printCountOfPrimeNumbers();
		assignment_10.printSumOfPrimeNumbers();
		assignment_10.printAvgOfPrimeNumbers();
	}
}
