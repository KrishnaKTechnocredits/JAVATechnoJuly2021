package monali.codingTest_4and5;

public class First5PerfectNumber {

	boolean findperfectNumber(int number) {

		int input = number;
		int sum = 0;
		for (int index = 1; index < number; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == input)
			return true;
		else
			return false;
	}

	void first5PerfectNumbers(int num) {
		int count = 0;
		int number = 1;
		while (count != num) {
			if (findperfectNumber(number)) {
				count++;
				System.out.println(number);
			}
			number++;
		}
	}

	public static void main(String[] args) {
		First5PerfectNumber c5 = new First5PerfectNumber();
		c5.first5PerfectNumbers(5);
	}
}
