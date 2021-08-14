package bhagyashree;

public class Assignment10 {
	int count = 0;
	int sum = 0;
	int average=0;

	void isPrimeNumber(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				System.out.println(number + " is not prime");
				break;
			}
		}
		if (status == true) {
			System.out.println(number + " is prime");
			count++;
			sum = sum + number;
			average = sum / count;
		}

	}

	void isPrimeNumberInRange(int startnumber, int endnumber) {
		for (int number = startnumber; number <= endnumber; number++)
			isPrimeNumber(number);
	}

	void printTotlCountofPrimeNumber() {
		System.out.println("Total count of prime numbers is:  " + count);
		System.out.println("--------------------------------------");

	}

	void printSumofPrimeNumber() {
		System.out.println("Sum of Prime Number: " + sum);
		System.out.println("--------------------------------------");
	}

	void printAverageOfPrimeNumber() {
		System.out.println("Average of prime numbers is: " + average);
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		// assignment10.isPrimeNumber(17);
		assignment10.isPrimeNumberInRange(100, 120);

		assignment10.printTotlCountofPrimeNumber();

		assignment10.printSumofPrimeNumber();

		assignment10.printAverageOfPrimeNumber();
	}
}
