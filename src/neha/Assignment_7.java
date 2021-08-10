package neha;

//Loop Assignment
public class Assignment_7 {
	// Logic 1: Print all even numbers on user defined range
	void printEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers for user defined range " + startIndex + ":" + endIndex + " are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	// Logic 2: On user defined range print all numbers which are divisible by 5
	void printNumbersDivisibleByFive(int startIndex, int endIndex) {
		System.out
				.println("\r\nFor user defined range " + startIndex + ":" + endIndex + " ,numbers Divisible by 5 are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index != 0) {
				System.out.println(index);
			}
		}
	}

	// Logic 3: On user defined range print all numbers which are divisible by 5 and
	// divisible by 3
	void printNumbersDivisibleByThreeAndFive(int startIndex, int endIndex) {
		System.out.println("\r\nFor user defined range " + startIndex + ":" + endIndex
				+ " ,numbers Divisible by both 3 and 5 are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println(index);
			}
		}
	}

	// Logic 4: On user defined range print all numbers which are divisible by
	// either 7 or 13
	void printNumbersDivisibleBySevenOrThirteen(int startIndex, int endIndex) {
		System.out.println("\r\nFor user defined range " + startIndex + ":" + endIndex
				+ " ,numbers Divisible by either 7 0r 13 are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " is divisible by 7");
			}
			if (index % 13 == 0) {
				System.out.println(index + " is divisible by 13");
			}
		}
	}

	// Logic 5: Find sum of all the numbers in user defined range
	void findSumOfNumbers(int startIndex, int endIndex) {
		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			sum += index;
		}
		System.out.println("\r\nSum for user defined range " + startIndex + ":" + endIndex + " is " + sum);
	}

	// Logic 6: Find difference between sum of odd numbers and even numbers in a
	// given range
	void findDifferenceEvenSumAndOddSum(int startIndex, int endIndex) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				evenSum += index;
			} else {
				oddSum += index;
			}
		}
		System.out.println("\r\nDifference between sum of odd numbers and even numbers in range " + startIndex + ":"
				+ endIndex + " is " + (oddSum - evenSum));
	}

	// Logic 7: Print only odd numbers in reverse order
	void printOddNumbersInReverse(int startIndex, int endIndex) {
		System.out.println(
				"\r\nFor user defined range " + startIndex + ":" + endIndex + " odd numbers in reverse order are:");
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 != 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.printEvenNumbers(10, 15);
		assignment_7.printNumbersDivisibleByFive(10, 30);
		assignment_7.printNumbersDivisibleByThreeAndFive(5, 18);
		assignment_7.printNumbersDivisibleBySevenOrThirteen(5, 40);
		assignment_7.findSumOfNumbers(1, 5);
		assignment_7.findDifferenceEvenSumAndOddSum(3, 9);
		assignment_7.printOddNumbersInReverse(10, 20);
	}

}
