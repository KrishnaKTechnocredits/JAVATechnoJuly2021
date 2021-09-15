
/*
 * Find first 5 perfect numbers.
 */
package bhagyashree;

public class CodingTest5 {

	int count = 0;

	void getPerfectNumber(int inputNumber) {
		int sum = 1;

		for (int index = 2; index <= inputNumber / 2; index++) {
			if (inputNumber % index == 0) {
				sum += index;
			}
		}
		if (sum == inputNumber) {
			count++;
			System.out.println(inputNumber + " Is perfect number");
		}
		inputNumber++;
	}

	void getFirstNPerfectNumber(int n) {
		int number = 2;
		while (count <= n) {
			getPerfectNumber(number);
			number++;
		}
	}

	public static void main(String[] args) {
		CodingTest5 test5 = new CodingTest5();
		test5.getFirstNPerfectNumber(5);
	}

}
