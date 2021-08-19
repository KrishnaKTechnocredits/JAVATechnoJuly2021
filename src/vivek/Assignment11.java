package vivek;

public class Assignment11 {

	int cnt;

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
			cnt++;
		}
	}

	void printPrimeNumbers(int firstNNumber) {
		int index = 2;
		while (cnt < firstNNumber) {
			findPrimeNumber(index);
			index++;
		}

	}

	void sumOfNnumbers(int totalSum) {
		int number = 1;
		int sum = 0;
		
		while (sum <= totalSum) {
			sum = sum + number;
			number++;
		}
		System.out.println("\nTotal numbers having a sum of " + totalSum + " is " + (number-1));
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.printPrimeNumbers(10);
		assignment11.sumOfNnumbers(100);
	}
}