package parthav;

public class MathCalculation {
	void printEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
		System.out.println("-------------------------");
	}

	void printNumbersdivisibleby5(int startIndex, int endIndex) {
		System.out.println("Divisible by 5, the numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
		System.out.println("-------------------------");
	}

	void numbersDivisibleby5and3(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 and 3, the numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
		System.out.println("-------------------------");
	}

	void numbersDivisibleby7or13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, the numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");

		}
		System.out.println("-------------------------");
	}

	void sumOfAllNumbers(int startIndex, int endIndex) {
		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			sum += index;
		}
		System.out.println("sum is: " + sum);
		System.out.println("-------------------------");
	}

	void sumDifferenceEvenOdd(int startIndex, int endIndex) {
		int oddSum = 0;
		int evenSum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				evenSum += index;
			else
				oddSum += index;
		}
		System.out.println("The difference is: " + (oddSum - evenSum));
		System.out.println("-------------------------");

	}

	void printOddInReverse(int rangeStart, int rangeEnd) {
		System.out.println("The odd numbers in reverse order are: ");
		for (int index = rangeEnd; index >= rangeStart; index--) {
			if (index % 2 != 0)
				System.out.println(index);
		}
		System.out.println("-------------------------");
	}

	public static void main(String[] args) {
		MathCalculation mathCalculation = new MathCalculation();
		mathCalculation.printEvenNumbers(10, 15);
		mathCalculation.printNumbersdivisibleby5(10, 30);
		mathCalculation.numbersDivisibleby5and3(5, 18);
		mathCalculation.numbersDivisibleby7or13(5, 40);
		mathCalculation.sumOfAllNumbers(1, 5);
		mathCalculation.sumDifferenceEvenOdd(3, 9);
		mathCalculation.printOddInReverse(10, 20);
	}

}
