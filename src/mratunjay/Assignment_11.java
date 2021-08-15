package mratunjay;

public class Assignment_11 {

	int primeNumberCounter;

	void isPrime(int num) {
		boolean status = true;
		int index = 2;
		while (index < num) {

			if (num % index == 0) {
				status = false;
			}
			index++;
		}
		if (status) {
			System.out.println("number is prime" + index);
			primeNumberCounter++;
		}

	}

	void firstNPrimeNumbers(int inputNumber) {
		int isPrimeInput = 2;
		while (primeNumberCounter < inputNumber) {

			isPrime(isPrimeInput);

			isPrimeInput++;

		}
	}

	void getSumNumberMethod(int x) {
		int index = 1;
		int sum = 0;
		while (sum < x) {
			sum = sum + index;

			System.out.println("numbers whose sum are " + x + " is: " + index);
			index++;
		}
	}

	public static void main(String[] args) {

		Assignment_11 A_11 = new Assignment_11();

		A_11.firstNPrimeNumbers(10);
		A_11.getSumNumberMethod(100);

	}

}
