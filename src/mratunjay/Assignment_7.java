package mratunjay;

public class Assignment_7 {

	void FindAllEvenNumbers(int x, int y) {

		for (; x < y; x++) {

			if (x % 2 == 0)
				System.out.println("Even numbers are: " + x);
		}

	}

	void FindNumberDivisibileBy5(int x, int y) {

		for (; x < y+1; x++) {

			if (x % 5 == 0)
				System.out.println("Numbers divisible by 5 are: " + x);
		}

	}

	void FindNumberDivisibileBy5and3(int x, int y) {

		for (; x < y; x++) {

			if (x % 5 == 0 && x % 3 == 0)
				System.out.println("Numbers divisible by 5 and 3 are: " + x);
		}

	}

	void FindNumberDivisibileBy7and13(int x, int y) {

		for (; x < y; x++) {

			if (x % 7 == 0 || x % 13 == 0)
				System.out.println("Numbers divisible by 7 or 13 are: " + x);

		}

	}

	void FindSumOfAllNumbers(int x, int y) {

		int sum = 0;
		for (; x < y + 1; x++) {

			sum = sum + x;

		}
		System.out.println("Sum of all number of given range input is: " + sum);

	}

	void FindDifferenceOfSumOfOddAndEvenNumbers(int x, int y) {

		int evensum = 0;
		int oddsum = 0;
		int difference = 0;

		for (; x < y + 1; x++) {

			if (x % 2 == 0)
				evensum = evensum + x;
			else
				oddsum = oddsum + x;
		}

		difference = oddsum - evensum;
		System.out.println("Difference of sum of odd and even numbers is: " + difference);
	}

	void PrintOnlyOddNumbersInReverseOrder(int x, int y) {

		for (; y > x; y--) {

			if (y % 2 != 0)
				System.out.println("Odd numbers in reverse order: " + y);
		}

	}

	public static void main(String[] args) {

		Assignment_7 A7 = new Assignment_7();
		A7.FindAllEvenNumbers(10, 15);
		A7.FindNumberDivisibileBy5(10, 30);
		A7.FindNumberDivisibileBy5and3(5, 18);
		A7.FindNumberDivisibileBy7and13(5, 40);
		A7.FindSumOfAllNumbers(1, 5);
		A7.FindDifferenceOfSumOfOddAndEvenNumbers(3, 9);
		A7.PrintOnlyOddNumbersInReverseOrder(10, 20);
	}

}
