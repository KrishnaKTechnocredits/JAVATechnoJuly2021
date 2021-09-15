/* Test 5 :
Find first 5 perfect numbers. */

package akanksha_Jain;

public class Coding_Test_5 {
	int count = 0;

	void isPerfectNumber(int number) {
		int sum = 0;
		for (int index = 1; index < number; index++) {
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
		Coding_Test_5 codingTest5 = new Coding_Test_5();
		codingTest5.printFirstNPerfectNumber(5);
	}
}
