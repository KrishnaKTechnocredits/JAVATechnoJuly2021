package neha.assignment_31;

import java.util.Scanner;

public class FindPerfectNumbersInRange {
	Boolean findPerfectNum(int num) {
		int sum = 0;
		for (int index = 1; index <= num / 2; index++) {
			if (num % index == 0)
				sum += index;
		}
		if (sum == num)
			return true;
		else
			return false;

	}

	void displayPerfectNumbersInRange(int startIndex, int endIndex) {
		for (int i = startIndex; i <= endIndex; i++) {
			if (findPerfectNum(i))
				System.out.println(i + " is perfect number");
		}
	}

	public static void main(String[] args) {
		FindPerfectNumbersInRange findPerfectNumbersInRange = new FindPerfectNumbersInRange();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start index:");
		int startIndex = scan.nextInt();
		System.out.println("Please enter end index:");
		int endIndex = scan.nextInt();
		if (startIndex > endIndex) {
			System.out.println("Please enter end index which should be greater than start index " + startIndex);
			endIndex = scan.nextInt();
		}
		if (endIndex > startIndex) {
			System.out.println("\r\nPerfect Numbers between range " + startIndex + " : " + endIndex + " are ");
			findPerfectNumbersInRange.displayPerfectNumbersInRange(startIndex, endIndex);
		}
	}
}
