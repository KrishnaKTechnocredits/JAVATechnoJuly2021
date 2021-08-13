//Assignment 10:

package parthav;

public class PrimeNumber {
	int countOfPrimeNumbers;
	int sumOfPrimeNumbers;
	int avgofPrimeNumbers;

	void verifyIsPrime(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println(number + " is a prime number");
			countOfPrimeNumbers++;
			sumOfPrimeNumbers += number;
		}

	}

	void printPrimeNumberInRange(int startRange, int endRange) {
		System.out.println("--------Start of finding Prime numbers in range program------- ");
		for (int index = startRange; index <= endRange; index++) {
			verifyIsPrime(index);
		}
		System.out.println("--------End of finding Prime numbers in range program------- ");

	}

	void printCountOfPrimeNumbersInRange(int startRange, int endRange) {
		System.out.println("--------Start of counting Prime numbers in range program------- ");
		for (int index = startRange; index <= endRange; index++) {
			verifyIsPrime(index);
		}
		System.out.println("The total number of prime numbers between " + startRange + " and " + endRange + " are "
				+ countOfPrimeNumbers);
		System.out.println("--------End of counting Prime numbers in range program------- ");
	}

	void printSumOfPrimeNumbersInRange(int startRange, int endRange) {
		System.out.println("--------Start of displaying sum of Prime numbers in range program------- ");
		for (int index = startRange; index <= endRange; index++) {
			verifyIsPrime(index);
		}
		System.out.println(
				"The sum of prime numbers between " + startRange + " and " + endRange + " is " + sumOfPrimeNumbers);
		System.out.println("--------End of displaying sum of Prime numbers in range program------- ");
	}

	void printAvgOfPrimeNumbersInRange(int startRange, int endRange) {
		System.out.println("--------Start of displaying average of Prime numbers in range program------- ");
		for (int index = startRange; index <= endRange; index++) {
			verifyIsPrime(index);
		}
		avgofPrimeNumbers = sumOfPrimeNumbers / countOfPrimeNumbers;
		System.out.println(
				"The average of prime numbers between " + startRange + " and " + endRange + " is " + avgofPrimeNumbers);
		System.out.println("--------End of displaying average of Prime numbers in range program------- ");
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.verifyIsPrime(17);
		primeNumber.verifyIsPrime(23);
		PrimeNumber primeNumber1 = new PrimeNumber();
		primeNumber1.printPrimeNumberInRange(100, 120);
		PrimeNumber primeNumber2 = new PrimeNumber();
		primeNumber2.printCountOfPrimeNumbersInRange(100, 120);
		PrimeNumber primeNumber3 = new PrimeNumber();
		primeNumber3.printSumOfPrimeNumbersInRange(100, 120);
		PrimeNumber primeNumber4 = new PrimeNumber();
		primeNumber4.printAvgOfPrimeNumbersInRange(100, 120);
	}

}
