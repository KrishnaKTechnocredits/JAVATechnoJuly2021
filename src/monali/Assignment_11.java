package monali;

public class Assignment_11 {

	int count;
	int primeCount = 1;

	void verifyNumberIsPrime(int number) {
		boolean flag = true;
		int index = 2;
		while (index < number) {
			if (number % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if (flag) {
			System.out.println(number + " is prime number");
			count++;
		}
	}

	void first10PrimeNumbers(int number) {
		System.out.println("First Program Output first 10 prime numbers---> ");
		while (count != number) {
			verifyNumberIsPrime(primeCount);
			primeCount++;
		}

	}

	void countNumberGenerateSumGreaterThan100() {

		int sum = 0;
		int number = 0;
		while (sum < 100) {
			number++;
			sum = sum + number;
		}
		System.out.println("2nd Program Output --> Numbers count which generate sum more than 100 : " + number);

	}

	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.first10PrimeNumbers(10);
		assignment_11.countNumberGenerateSumGreaterThan100();
	}

}
