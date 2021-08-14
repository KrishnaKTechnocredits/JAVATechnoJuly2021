package sameer;

public class Assignment10 {
	float count;
	float sum;

	void verifyPrimeNumber(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				System.out.println(number + " Is Not a Prime Number");
				break;
			}
		}
		if (status) {
			System.out.println(number + " Is a Prime Number");
			count++;
			sum = sum + number;
		}
	}

	void verifyPrimeNumberRange(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			verifyPrimeNumber(index);
		}
	}

	void countOfPrimeNumber() {
		System.out.println("Total Count of Prime Number :" + count);
	}

	void sumOfPrimeNumber() {
		System.out.println("Sum Of Prime Numbe Is :" + sum);
	}

	void avgOfPrimeNumber() {
		float avg = sum / count;
		System.out.println("Average of Prime Number Is :" + avg);
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.verifyPrimeNumber(7);
		assignment10.verifyPrimeNumberRange(25, 55);
		assignment10.countOfPrimeNumber();
		assignment10.sumOfPrimeNumber();
		assignment10.avgOfPrimeNumber();
	}
}
