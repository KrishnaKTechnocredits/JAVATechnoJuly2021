package shweta_Dharmadhikari.loopdemo;

class Assignment7  {

	void displayEvenNumbers(int index, int endIndex) {
		System.out.println("Even numbers are: ");
		for (; index <= endIndex; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
		System.out.println(" ");
	}

	void displayDivisibleByFive(int index, int endIndex) {
		System.out.println("Divisible by 5, numbers are: ");
		for (; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
		System.out.println(" ");
	}

	void displayDivisibleByFiveANDThree(int index, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers is: ");
		for (; index <= endIndex; index++) {
			if (index % 3 == 0 && index % 5 == 0)
				System.out.println(index);
		}
		System.out.println(" ");
	}

	void displayDivisibleBySevenOrThirteen(int index, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (; index <= endIndex; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
		}
		System.out.println(" ");
	}

	void sumOfAllNumbers(int index, int endIndex) {
		int sum = 0;
		for (; index <= endIndex; index++) {
			sum = sum + index;
		}
		System.out.println("Sum is " + sum);
		System.out.println(" ");
	}

	void diffBetweenSumOfOddNumbersAndEvenNumbers(int startIndex, int endIndex) {
		int evenSum = 0;
		int oddSum = 0;
		int diff = 0;
		System.out.println("difference between sum of odd numbers and even numbers is: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				evenSum = evenSum + index;
			else
				oddSum = oddSum + index;
		}
		diff = oddSum - evenSum;
		System.out.println(diff);
		System.out.println(" ");
	}

	void displayReverseOddNum(int startIndex, int endIndex) {
		System.out.println("odd numbers in reverse order are: ");
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 != 0)
				System.out.println(index);
		}
	}

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.displayEvenNumbers(10, 15);
		assignment7.displayDivisibleByFive(10, 30);
		assignment7.displayDivisibleByFiveANDThree(5, 18);
		assignment7.displayDivisibleBySevenOrThirteen(5, 40);
		assignment7.sumOfAllNumbers(1, 5);
		assignment7.diffBetweenSumOfOddNumbersAndEvenNumbers(3, 9);
		assignment7.displayReverseOddNum(10, 20);
	}
}