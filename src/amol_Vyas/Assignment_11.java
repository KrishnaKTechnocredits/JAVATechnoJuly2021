package amol_Vyas;

public class Assignment_11 {

	int primeCount = 0;

	void isPrime(int n) {
		boolean status = true;
		int index = 2;
		while (index < n) {
			if (n % index == 0) {
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
			sum += index;
			index++;
			count++;
		}
		System.out.println(count + " numbers are required for sum of " + number);
	}
	
	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.firstNPrimeNumbers(10);
		assignment_11.sumOfNumbers(100);
	}
}
