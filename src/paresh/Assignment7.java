package paresh;

public class Assignment7 {

	void findEvenNumber(int startIndex, int endIndex) {
		System.out.println("Even numbers are: ");
		for (; startIndex < endIndex; startIndex++)
			if (startIndex % 2 == 0) {
				System.out.println(+startIndex);
			}
	}

	void divisibleby5(int startIndex, int endIndex) {
		System.out.println("Divisible by 5, numbers are: ");
		for (; startIndex <= endIndex; startIndex++)
			if (startIndex % 5 == 0)
				System.out.println(+startIndex);
	}

	void divisibleby5and3(int startIndex, int endIndex) {
		System.out.println("Divisible by 3 & 5 numbers are: ");
		for (; startIndex <= endIndex; startIndex++)
			if (startIndex % 3 == 0 && startIndex % 5 == 0) {
				System.out.println(+startIndex);
			}
	}

	void divisibleby7and13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for (; startIndex <= endIndex; startIndex++) {
			if (startIndex % 7 == 0) {
				System.out.println(+startIndex + " is divisible by 7");
			}
			if (startIndex % 13 == 0) {
				System.out.println(+startIndex + " is divisible by 13");
			}
		}
	}

	void sumOfAllnumbers(int startIndex, int endIndex) {
		int sum = 0;
		for (; startIndex <= endIndex; startIndex++)
			sum = sum + startIndex;
		System.out.println("Sum is: " + sum);

	}

	void diffOfSumOfOddEvenNumbers(int startIndex, int endIndex) {
		int evenSum = 0;
		int oddSum = 0;
		int difference;
		for (; startIndex <= endIndex; startIndex++) {
			if (startIndex % 2 == 0)
				evenSum = evenSum + startIndex;
			else
				oddSum = oddSum + startIndex;
		}
		difference = oddSum - evenSum;
		System.out.println("Difference of sum of odd and even numbers is: " + difference);
	}

	void printOddNumbersReverse(int startIndex, int endIndex) {
		System.out.println("Odd numbers in revers order: ");
		for (int i=endIndex; i >= startIndex; i--) {
			if (i % 2 != 0)
				System.out.println( + i);
		}
	}

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.findEvenNumber(10, 15);
		assignment7.divisibleby5(10, 30);
		assignment7.divisibleby5and3(5, 18);
		assignment7.divisibleby7and13(7, 40);
		assignment7.sumOfAllnumbers(1, 5);
		assignment7.diffOfSumOfOddEvenNumbers(3, 9);
		assignment7.printOddNumbersReverse(10, 20);
	}
}
