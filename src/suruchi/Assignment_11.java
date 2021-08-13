package suruchi;

public class Assignment_11 {

	int primeNumber;

	boolean verifyNumberIsPrime(int number) {
		boolean flag = true;
		int index = 2;
		while (index < number) {
			if (number % index == 0) {
				flag = false;
				// System.out.println(number + " is not a prime number");
				break;
			}
			index++;
		}
		return flag;
	}

	void printPrimeNumbers(int endIndex) {
		int count = 0;
		int number = 2;
		System.out.println("First " + endIndex + " prime numbers are: ");
		while (count < endIndex) {
			if (verifyNumberIsPrime(number)) {
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
	}

	void requiredNumbersForSum(int startIndex, int requiredSum) {
		int sum = 0;
		int counter = 0;
		while (sum <= requiredSum) {
			sum = sum + startIndex;
			counter++;
			startIndex++;
		}
		System.out.println("Total numbers required to generate sum more than " + requiredSum + " are: " + counter);
	}

	public static void main(String[] a) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.printPrimeNumbers(10);
		System.out.println();
		System.out.println();
		assignment_11.requiredNumbersForSum(1, 100);
	}
}
