package arti_G_CodingTest5;
//Find first 5 perfect numbers.

public class PerfectNumber {

	int count = 0;

	void isPerfectNumber(long input) {
		int sum = 0;
		for (int num = 1; num < input; num++) {
			if (input % num == 0) {
				sum = sum + num;
			}
		}
		if (input == sum) {
			count++;
			System.out.println(input + " is a perfect number");
		}
	}

	void getPerfectNumber(int num) {
		long index = 1;
		while (count <= num) {
			isPerfectNumber(index);
			index++;
		}
	}

	public static void main(String[] args) {
		PerfectNumber perfectNumber = new PerfectNumber();
		perfectNumber.getPerfectNumber(10);
	}

}
