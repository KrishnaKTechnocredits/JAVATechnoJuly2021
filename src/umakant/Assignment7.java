package umakant;

public class Assignment7 {

	void evenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy5(int startIndex, int endIndex) {
		System.out.println("Divisible by 5, numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy5And3(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 3 == 0 && index % 5 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy7Or13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 13 == 0 && index % 7 == 0)
				System.out.println(index + " is divisible by 7 and 13");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
			else if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
		}
	}

	void sumOfGivenNumbers(int startIndex, int endIndex) {
		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++)
			sum += index;
		System.out.println("Sum is " + sum);
	}

	void differenceOfOddAndEvenNumbers(int startIndex, int endIndex) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 != 0)
				oddSum += index;
			else
				evenSum += index;
		}
		System.out.println(oddSum - evenSum);
	}

	void oddNumbersInReverse(int startIndex, int endIndex) {
		System.out.println("odd numbers are:");
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 != 0)
				System.out.println(index);
		}
	}

	public static void main(String args[]) {
		Assignment7 assignment7 = new Assignment7();
		System.out.println("******************************************");
		assignment7.evenNumbers(10, 15);
		System.out.println("******************************************");
		assignment7.divisibleBy5(10, 30);
		System.out.println("******************************************");
		assignment7.divisibleBy5And3(5, 18);
		System.out.println("******************************************");
		assignment7.divisibleBy7Or13(5, 40);
		System.out.println("******************************************");
		assignment7.sumOfGivenNumbers(1, 5);
		System.out.println("******************************************");
		assignment7.differenceOfOddAndEvenNumbers(3, 9);
		System.out.println("******************************************");
		assignment7.oddNumbersInReverse(10, 20);
	}
}
