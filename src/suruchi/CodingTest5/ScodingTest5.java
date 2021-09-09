package suruchi.CodingTest5;

import java.util.Scanner;

public class ScodingTest5 {

	boolean isPerfectNumber(long input) {
		long output = 0;
		for (long index = 1; index < input; index++) {
			if (input % index == 0) {
				output += index;
			}
		}
		if (output == input)
			return true;
		return false;
	}

	void printFirstNPerfectNumbers(int n) {
		int count = 0;
		long perfectNumber = 1;
		while (count <= 5) {
			if (isPerfectNumber(perfectNumber)) {
				count++;
				System.out.println(perfectNumber);
			}
			perfectNumber++;
		}
	}

	public static void main(String[] args) {
		ScodingTest5 scodingTest5 = new ScodingTest5();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter value for n to get first n perfect numbers");
		int n = scanner.nextInt();

		System.out.println("First " + n + " perfect numbers are: ");
		scodingTest5.printFirstNPerfectNumbers(n);

		scanner.close();
	}
}