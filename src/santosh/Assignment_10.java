
package santosh;
public class Assignment_10 {
	int sum = 0;
	int count = 0;
	float average;

	void verifyPrimeNumber(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
		      break;
			}

		}
		if (status == true) {
			System.out.println(number + " is a prime no");
			count++;
			sum = sum + number;
			average = sum / count;
		}
	}

	void verifyPrimeNumberRange(int startRange, int endRange) {
		for (int number = startRange; number <= endRange; number++) {
			verifyPrimeNumber(number);
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

	public static void main(String[] a) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Assignment_10 assignment = new Assignment_10();
		System.out.println("List of prime numbers");
		assignment.verifyPrimeNumberRange(100, 120);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		assignment.totalCountofPrimeNumbers();
		assignment.sumofPrimeNumbers();
		assignment.averageofPrimeNumbers();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    } 
}
 