/*Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ */

package parthav.parthavD_Assignment31;

public class FindPerfectNumberInRange {

	void printPerfectNumberInRange(int startRange, int endRange) {

		boolean isPerfectNumber = false;

		System.out.println("The perfect numbers in the range of " + startRange + " to " + endRange + " is:");

		for (int index = startRange; index <= endRange; index++) {
			if (isPerfectNumber(index)) {
				System.out.println(index);
				isPerfectNumber = true;
			} else
				continue;
		}

		if (!isPerfectNumber)
			System.out.println("No perfect numbers in the range");

	}

	boolean isPerfectNumber(int number) {
		int sumOfDivisibles = 0;

		for (int index = 1; index <= number / 2; index++) {
			if (number % index == 0) {
				sumOfDivisibles += index;
			}
		}

		if (sumOfDivisibles == number)
			return true;
		else
			return false;

	}

}
