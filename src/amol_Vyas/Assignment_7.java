package amol_Vyas;

public class Assignment_7 {

	void printEvenNumbers(int startValue, int endValue) {
		System.out.println("Even numbers are: ");
		for (int index = startValue; index <= endValue; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
	}

	void printDivisibleByFive(int startValue, int endValue) {
		System.out.println("Divisible by 5, numbers are: ");
		for (int index = startValue; index <= endValue; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void printDivisibleByFiveAndThree(int startValue, int endValue) {
		System.out.println("Divisible by 5 and 3, numbers are: ");
		for (int index = startValue; index <= endValue; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
	}

	void printDivisibleBySevenOrThirteen(int startValue, int endValue) {
		System.out.println("Divisible by 7 and 13, numbers are: ");
		for (int index = startValue; index <= endValue; index++) {
			if (index % 7 == 0 || index % 13 == 0) {
				if (index % 7 == 0)
					System.out.println(index + " Number is divisible by 7");
				else if (index % 13 == 0)
					System.out.println(index + " Number is divisible by 13");
			}
		}
	}

	void printSumOfNumbers(int startValue, int endValue) {
		int sum = 0;
		for (int index = startValue; index <= endValue; index++) {
			sum = sum + index;
		}
		System.out.println("Sum is: " + sum);
	}
	
	void printDifferenceOddEven(int startValue, int endValue) {
		int oddSum = 0;
		int evenSum = 0;
		for (int index = startValue; index <= endValue; index++) {
			if(index%2==0)
				evenSum = evenSum + index;
			else
			oddSum = oddSum + index;
		}
		System.out.println("Difference between Odd and Even number is: " + (oddSum-evenSum));
	}
	
	void printOddNumberReverseOrder(int startValue, int endValue) {
		System.out.println("Odd numbers in reverse order are: ");
		for (int index = endValue; index >= startValue; index--) {
			if(index%2!=0)
				System.out.println(index);
		}
		
	}

	public static void main(String[] args) {
		Assignment_7 assignment7 = new Assignment_7();
		assignment7.printEvenNumbers(10, 15);
		assignment7.printDivisibleByFive(10, 30);
		assignment7.printDivisibleByFiveAndThree(5, 18);
		assignment7.printDivisibleBySevenOrThirteen(5, 40);
		assignment7.printSumOfNumbers(1, 5);
		assignment7.printDifferenceOddEven(3, 9);
		assignment7.printOddNumberReverseOrder(10, 20);
	}

}
