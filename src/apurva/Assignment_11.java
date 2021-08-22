package apurva;

public class Assignment_11 {

	void verifyPrimeNumbers(int countPrime) {

		int index = 2;
		int count = 0;
		while (count < countPrime) {
			boolean status = true;
			int number = 2;

			while (number < index) {

				if (index % number == 0)
					status = false;
				break;
			}
			number++;
			if (status) {
				System.out.println("         " + index);
				count++;
			}
			index++;
		}
	}

	void countNumbers(int index) {

		int number = 1;
		int count = 0;
		int sum = 0;

		while (sum < index) {
			sum = sum + number;
			number = number + 1;
			count++;

		}
		System.out.println("sum of number: " + sum);
		System.out.println("Count of number is: " + count);

	}

	public static void main(String[] args) {
		Assignment_11 assign = new Assignment_11();
		System.out.println("--Generate sum of 100 & count the numbers: ");
		assign.countNumbers(100);
		System.out.println("\n" + "--First 10 prime numbers--");
		assign.verifyPrimeNumbers(10);
	}
}