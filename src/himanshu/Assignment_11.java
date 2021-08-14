package himanshu;

public class Assignment_11 {

	int count;

	void findPrimeNumber(int number) {
		boolean status = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println(number + " is a prime number");
			count++;
		}
	}

	void printPrimeNumbers(int firstNNumber) {
		int index = 2;
		while (count < firstNNumber) {
			findPrimeNumber(index);
			index++;
		}

	}

	void sumOfNumbers(int totalSum) {
		int number = 1;
		int sum = 0;

		while (sum <= totalSum) {
			sum = sum + number;
			number++;
		}
		System.out.println("\n Sum of " + totalSum + " is " + (number - 1));
	}

	public static void main(String[] args) {
		Assignment_11 assignment_11 = new Assignment_11();
		assignment_11.printPrimeNumbers(10);
		assignment_11.sumOfNumbers(100);
	}
}
