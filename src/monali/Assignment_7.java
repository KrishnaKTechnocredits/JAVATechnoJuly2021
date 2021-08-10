package monali;

public class Assignment_7 {

	void printEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even Numbers are : ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
	}

	void numbersDivisiblBy5(int startIndex, int endIndex) {
		System.out.println("Divisible by 5, numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void numbersDivisibleBy5And3(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
	}

	void numberDivisibleBy7Or13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0 || index % 13 == 0)
				if (index % 7 == 0)
					System.out.println(index + " is divisible by " + 7);
				else
					System.out.println(index + " is divisible by " + 13);
		}
	}

	void sumOfNumbersInDefinedRange() {
		int sum = 0;
		for (int index = 1; index <= 5; index++)
			sum = sum + index;
		System.out.println("Sum is " + sum);
	}

	void diffOddSumAndEvenSum() {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 3; index <= 9; index++) {
			if (index % 2 == 0)
				evenSum = evenSum + index;
			else
				oddSum = oddSum + index;
		}
		System.out.println("Difference between odd and even sum range 3 to 9==> " + (oddSum - evenSum));
	}

	void printOddNumInReverseOrder() {
		System.out.println("Odd Numbers in Reverese Order: ");
		for (int index = 20; index >= 10; index--)
			if (index % 2 != 0)
				System.out.println(index);
	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.printEvenNumbers(10, 15);
		assignment_7.numbersDivisiblBy5(10, 30);
		assignment_7.numbersDivisibleBy5And3(5, 18);
		assignment_7.numberDivisibleBy7Or13(5, 40);
		assignment_7.sumOfNumbersInDefinedRange();
		assignment_7.diffOddSumAndEvenSum();
		assignment_7.printOddNumInReverseOrder();
	}

}
