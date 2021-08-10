package vivek;

public class Assignment7 {

	void printEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are:");
		for (int index = startIndex; index < endIndex; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
	}

	void printNumbersDivisibleBy5(int startIndex, int endIndex) {
		System.out.println("\nDivisible by 5, numbers are:");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void printNumbersDivisibleBy5and3(int startIndex, int endIndex) {
		System.out.println("\nDivisible by 5 & 3,numbers are:");
		for (int index = startIndex; index <= endIndex; index++)
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
	}

	void printNumbersDivisibleBy7or13(int startIndex, int endIndex) {
		System.out.println("\nDivisible by 7 or 13, numbers are:");
		for (int index = startIndex; index <= endIndex; index++)
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
	}

	void sumOfNumbers(int startIndex, int endIndex) {
		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++)
			sum = sum + index;
		System.out.println("\nsum is " + sum);
		System.out.println();
	}

	void sumDifferenceBetweenOddEven(int startIndex, int endIndex) {
		int sumodd = 0;
		int sumeven = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				sumeven = sumeven + index;
			else
				sumodd = sumodd + index;
		}
		System.out.println(sumodd - sumeven);
		System.out.println();
	}

	void printReverseOddNumbers(int startIndex, int endIndex) {
		for (int index = endIndex; index >= startIndex; index--)
			if (index % 2 != 0)
				System.out.println(index);
	}

	public static void main(String[] args) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.printEvenNumbers(10, 15);
		assignment7.printNumbersDivisibleBy5(10, 30);
		assignment7.printNumbersDivisibleBy5and3(5, 18);
		assignment7.printNumbersDivisibleBy7or13(5, 40);
		assignment7.sumOfNumbers(1, 5);
		assignment7.sumDifferenceBetweenOddEven(3, 9);
		assignment7.printReverseOddNumbers(10, 20);
	}
}
