package vivek;

public class Assignment10 {

	int sum;
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
			sum = sum + number;
		}
	}

	void findPrimeNumbersinRange(int startNumber, int endNumber) {
		for (int index = startNumber; index <= endNumber; index++) {
			findPrimeNumber(index);
		}

	}

	void countPrimenumbers() {
		System.out.println("\nNumber of prime numbers within the range are " + cnt);
	}

	void sumPrimenumbers() {
		System.out.println("\nSum of all the prime numbers is " + sum);
	}

	void avgPrimeNumbers() {
		System.out.println("\nAverage of the prime numbers within range is " + (sum / cnt));
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.findPrimeNumbersinRange(100, 120);
		assignment10.countPrimenumbers();
		assignment10.sumPrimenumbers();
		assignment10.avgPrimeNumbers();
	}

}
