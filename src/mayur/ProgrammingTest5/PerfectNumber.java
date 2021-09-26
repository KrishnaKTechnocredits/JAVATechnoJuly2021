/*Test 5 :
Find first 5 perfect numbers.*/
package mayur.ProgrammingTest5;

public class PerfectNumber {
	
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
		PerfectNumber perfectNumber = new PerfectNumber();
		perfectNumber.printFirstNPerfectNumber(5);
	}

}