/*Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170*/

package shraddha.Assignment31;

import java.util.Scanner;

public class PerfectNumbersInGivenRange {
	public static void main(String[] args) {
		PerfectNumbersInGivenRange newObject = new PerfectNumbersInGivenRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start range :- ");
		int startIndex = sc.nextInt();
		System.out.println("Enter end range :- ");
		int endIndex = sc.nextInt();
		int count = 0;
		String perfectNumbers = "";
		if (startIndex < endIndex) {
			for (int index = startIndex; index <= endIndex; index++) {
				if (newObject.checkForPerfectNumber(index)) {
					count++;
					perfectNumbers = perfectNumbers + " " + index;
				}
			}
			if (count != 0)
				System.out.println(
						"Perfect numbers between " + startIndex + " and " + endIndex + " are :- " + perfectNumbers);
		} else
			System.out.println("Invalid Index Input !!");
	}

	boolean checkForPerfectNumber(int number) {
		int sum = 0;
		for (int index = 1; index <= number / 2; index++) {
			if (number % index == 0)
				sum += index;
		}
		if (sum == number)
			return true;
		else
			return false;
	}
}
