package sameer;

public class Assignment_7 {

	void pirntEvenNumbers() {
		for (int index = 10; index <= 15; index++) {
			if (index % 2 == 0)
				System.out.println("Even Number is :" + index);
		}
	}

	void printNumberDivBy5() {
		for (int index = 10; index <= 30; index++) {
			if (index % 5 == 0)
				System.out.println("Number Divisible By 5 is :" + index);
		}
	}

	void printNumberDivBy3and5() {
		for (int index = 5; index <= 18; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println("Number Divisible By 3 and 5 is :" + index);
		}
	}

	void printNumberDivBy7or13() {
		for (int index = 5; index <= 40; index++) {
			if (index % 7 == 0 || index % 13 == 0)
				System.out.println("Number Divisible By 7 or 13 is :" + index);
		}
	}

	void sumOfAllNumbers() {
		int sum = 0;
		for (int index = 1; index <= 5; index++) {
			sum = sum + index;
			System.out.println("Sum Of All Numbers Is : " + sum);
		}

	}

	void diffBetSumOfOddEvenNumbers() {
		int diff, sumENumber = 0, sumONumber = 0;
		for (int index = 3; index <= 9; index++) {
			if (index % 2 != 0)
				sumONumber = sumONumber + index;
			else
				sumENumber = sumENumber + index;

		}
		diff = sumONumber - sumENumber;
		System.out.println("Difference Between Sum Of Odd and Even NUmber is : " + diff);
	}

	void printOddNumReverse() {
		for (int index = 20; index >= 10; index--) {
			if (index % 2 != 0)
				System.out.println("Odd Numbers in Revers Order is: " + index);
		}

	}

	public static void main(String[] args) {
		Assignment_7 assignment7 = new Assignment_7();
		assignment7.pirntEvenNumbers();
		assignment7.printNumberDivBy5();
		assignment7.printNumberDivBy3and5();
		assignment7.printNumberDivBy7or13();
		assignment7.sumOfAllNumbers();
		assignment7.diffBetSumOfOddEvenNumbers();
		assignment7.printOddNumReverse();
	}
}
