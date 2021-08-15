package himanshu;

public class Assignment_10 {

	int count;
	int sum;
	int average;

	void primeNumber(int number) {
		boolean check = true;
		for (int index = 2; index < number; index++) {
			if (number % index == 0) {
				// System.out.println(number + " Number is not a Prime Number");
				check = false;
			}
		}
		if (check) {
			System.out.println(number + " Number is a Prime Number");
			count = count + 1;
			sum = sum + number;
			average = sum / count;
		}
	}

	void primeNumberBetweenRange(int start, int end) {
		for (int number = start; number <= end; number++)
			primeNumber(number);
	}

	void count() {
		System.out.println("Total Numbers which are Prime Number: " + count);
	}

	void sum() {
		System.out.println("Total Sum of Prime Numbers:" + sum);
	}

	void average() {
		System.out.println("Average of Prime Number:" + average);
	}

	public static void main(String[] args) {
		Assignment_10 assignment_10 = new Assignment_10();
		assignment_10.primeNumberBetweenRange(100, 120);
		assignment_10.count();
		assignment_10.sum();
		assignment_10.average();
	}
}
