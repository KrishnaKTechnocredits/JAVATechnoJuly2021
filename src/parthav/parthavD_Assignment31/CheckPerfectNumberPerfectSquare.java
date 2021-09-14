/*Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number

input : 50
output : 50 is not a perfect number

Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.*/

package parthav.parthavD_Assignment31;

public class CheckPerfectNumberPerfectSquare {

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

	void printPerfectNumber(int number) {
		boolean isPerfect = isPerfectNumber(number);
		if (isPerfect)
			System.out.println("The number " + number + " is a Perfect number");
		else
			System.out.println("The number " + number + " is not a Perfect number");
	}

	void printPerfectSquare(int number) {
		boolean isPerfectSquare = isPerfectSquare(number);
		if (isPerfectSquare)
			System.out.println("The number " + number + " is a Perfect square");
		else
			System.out.println("The number " + number + " is not a Perfect square");
	}

	boolean isPerfectSquare(int number) {

		for (int index = 1; index < number; index++) {
			if (index * index == number)
				return true;
			else
				continue;

		}

		return false;

	}

}
