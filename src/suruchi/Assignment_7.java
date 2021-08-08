package suruchi;

public class Assignment_7 {

	void printEvenNumbers(int startIndex1, int endIndex1) {
		System.out.println("Even Numbers between " + startIndex1 + " and " + endIndex1 + " are:");
		for (int index = startIndex1; index <= endIndex1; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
		System.out.println();
	}

	void printNumbersDivisibleBy5(int startIndex2, int endIndex2) {
		System.out.println("Numbers divisible by 5 between " + startIndex2 + " and " + endIndex2 + " are:");
		for (int index = startIndex2; index <= endIndex2; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
		System.out.println();
	}

	void printNumbersDivisibleBy3And5(int startIndex3, int endIndex3) {
		System.out.println("Numbers divisible by 5 & 3 between " + startIndex3 + " and " + endIndex3 + " are:");
		for (int index = startIndex3; index <= endIndex3; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index);
			}
		}
		System.out.println();
	}

	void printNumbersDivisbleBy7Or13(int startIndex4, int endIndex4) {
		System.out
				.println("Divisibility for numbers by 7 or 13 between " + startIndex4 + " and " + endIndex4 + " are:");
		for (int index = startIndex4; index <= endIndex4; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + " is divisible by 13");
			}
		}
		System.out.println();
	}

	void printSumOfNumbers(int startIndex5, int endIndex5) {
		System.out.println("Sum of numbers from " + startIndex5 + " to " + endIndex5 + " is:");
		int sum = 0;
		for (int index = startIndex5; index <= endIndex5; index++) {
			sum = sum + index;
		}
		System.out.println(sum);
		System.out.println();
	}

	void printDifferenceBetweenSumOddEvenNumbers(int startIndex6, int endIndex6) {
		int sum1 = 0;
		int sum2 = 0;
		for (int index = startIndex6; index <= endIndex6; index++) {
			if (index % 2 != 0) {
				sum1 = sum1 + index;
			} else if (index % 2 == 0) {
				sum2 = sum2 + index;
			}
		}
		int diff = sum1 - sum2;
		System.out.println("Difference between sum of odd and even numbers ranging from " + startIndex6 + " to "
				+ endIndex6 + " is: " + diff);
		System.out.println();
	}

	void printOddNumbersReverse(int startIndex7, int endIndex7) {
		System.out.println("Odd Numbers in reverse from " + startIndex7 + " to " + endIndex7 + " are:");
		for (int index = endIndex7; index > startIndex7; index--) {
			if (index % 2 != 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] a) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.printEvenNumbers(10, 15);
		assignment_7.printNumbersDivisibleBy5(10, 30);
		assignment_7.printNumbersDivisibleBy3And5(5, 18);
		assignment_7.printNumbersDivisbleBy7Or13(5, 40);
		assignment_7.printSumOfNumbers(1, 5);
		assignment_7.printDifferenceBetweenSumOddEvenNumbers(3, 9);
		assignment_7.printOddNumbersReverse(10, 20);
	}
}
