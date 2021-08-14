package shreya;

public class PrintFirstNPrimeNo {

	int primeCount = 0;

	void isPrime(int number) {
		boolean status = true;
		int index = 2;
		while (index < number) {
			if (number % index == 0) {
				status = false;
			}
			index++;
		}
		if (status) {
			primeCount++;
			System.out.println(index);
		}
	}

	void firstNPrimeNumbers(int count) {
		System.out.println("First "+count+" prime numbers are:");
		int number = 2;
		while (primeCount < count) {
			isPrime(number);
			number++;
		}
	}

	void sumOfNumbers(int number) {
		int sum = 0;
		int index = 1;
		int count=0;
		while (sum < number) {
			sum = sum+index;
			index++;
			count++;
		}
		System.out.println(count+" Numbers are required for Sum of " + number);
	}

	public static void main(String[] args) {
		PrintFirstNPrimeNo assignment_11 = new PrintFirstNPrimeNo();
		System.out.println("--Print First 10 Prime Number--");
     	assignment_11.firstNPrimeNumbers(10);
		System.out.println("--Find out required numbers to generate sum more than 100--");
		assignment_11.sumOfNumbers(100);
	}
}
 