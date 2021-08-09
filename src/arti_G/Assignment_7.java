package arti_G;

public class Assignment_7 {

	void printEvenNumbers(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println("Even Numbers are: " + index);

			}
		}
		System.out.println("****************************************************");
	}

	void divisibleByFive(int startIndex, int endIndex) {
		for (int index = 10; index <= 30; index++) {
			if (index % 5 == 0) {
				System.out.println("Divisible by 5, numbers are: " + index);

			}
		}
		System.out.println("****************************************************");
	}

	void divisibleByFiveAndThree(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println("Divisible by 5 & 3, numbers are:" + index);

			}
		}
		System.out.println("****************************************************");
	}

	void divisibleBySevenAndThirteen(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0 || index % 13 == 0) {
				System.out.println("Divisible by 7 or 13, numbers are: ");
				if (index % 7 == 0) {
					System.out.println(index + " is divisible by 7");
				} else if (index % 13 == 0) {
					System.out.println(index + " is divisible by 13");
				}
			}

		}
		System.out.println("****************************************************");
	}

	int sum = 0;

	void sumOfNumbers(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex;) {
			sum = sum + index;
			index++;
		}
		System.out.println("Sum is " + sum);
		System.out.println("****************************************************");
	}

	void sumOfOddAndEvenNumbers(int startIndex, int endIndex) {
		int sumOfOdd = 0;
		int sumOfEven = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				sumOfEven = sumOfEven + index;

			} else {
				sumOfOdd = sumOfOdd + index;

			}
		}
		int numbers = sumOfOdd - sumOfEven;
		System.out.println("Sum of odd and even numbers is " + numbers);
		System.out.println("****************************************************");
	}

	void oddNumbersInReverseOrder(int startIndex, int endIndex) {
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 != 0) {
				System.out.println("Odd Numbers in reverse order is " + index);
			}
		}

	}

	public static void main(String[] args) {

		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.printEvenNumbers(10, 15);
		assignment_7.divisibleByFive(10, 30);
		assignment_7.divisibleByFiveAndThree(5, 18);
		assignment_7.divisibleBySevenAndThirteen(5, 40);
		assignment_7.sumOfNumbers(1, 5);
		assignment_7.sumOfOddAndEvenNumbers(3, 9);
		assignment_7.oddNumbersInReverseOrder(10, 20);
	}
}
