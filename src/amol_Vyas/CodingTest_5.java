package amol_Vyas;

public class CodingTest_5 {

	int count = 0;

	void isPerfectNumber(int number) {
		int sum = 1;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == number) {
			count++;
			System.out.println(number + " is a perfect number");
		}
	}

	void printFirstNPerfectNumber(int num) {
		int number = 1;
		while (count <= num) {
			isPerfectNumber(number);
			number++;
		}
	}

	public static void main(String[] args) {
		CodingTest_5 codingTest_5 = new CodingTest_5();
		codingTest_5.printFirstNPerfectNumber(5);
	}

}
