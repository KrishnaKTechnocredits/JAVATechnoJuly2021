package paresh;

public class Assignment10 {

	int count = 0;
	int sum = 0;
	float avg;

	void numberIsPrime(int number) {

		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				break;
			}
		}
		if (status == true) {
			System.out.println(number + " is a prime number");

		count++;
		sum = sum + number;
		avg = sum / count;
		}
	}

	void primeNumberInRange(int startIndex, int endIndex) {

		for (int index = startIndex; index <= endIndex; index++) {
			numberIsPrime(index);

		}
	}

	void countPrime() {

		System.out.println("Prime Number count is: " + count);

	}

	void sumOfPrime() {

		System.out.println("Sum of Prime number: " + sum);
	}

	void avgOfPrime() {

		System.out.println("Avgerge of Prime number: " + avg);
	}

	public static void main(String[] arg) {

		Assignment10 assignment10 = new Assignment10();
		assignment10.numberIsPrime(10);
		assignment10.primeNumberInRange(100, 120);
		assignment10.countPrime();
		assignment10.sumOfPrime();
		assignment10.avgOfPrime();

	}
}
