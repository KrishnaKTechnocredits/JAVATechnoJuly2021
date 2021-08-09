package shalaka.Assignment_7;

class Assignment_7 {
	void displayEvenNumber(int startIndex, int endIndex) {
		System.out.println("Even Numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
		System.out.println();
	}

	void displayNumberDivBy5(int startIndex, int endIndex) {
		System.out.println("Number Divisible by 5: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
		System.out.println();
	}

	void displayNumberDivBy5and3(int startIndex, int endIndex) {
		System.out.println("Number Divisible by 5 and 3: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
		System.out.println();
	}

	void displayNumberDivBy7or13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
		}
		System.out.println();
	}

	void displaySum(int startIndex, int endIndex) {
		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			sum += index;
		}
		System.out.println("Sum is " + sum);
		System.out.println();
	}

	void displayDiff(int startIndex, int endIndex) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				evenSum += index;
			else
				oddSum += index;
		}
		System.out.println("Difference between sum of odd numbers and even numbers is " + (oddSum - evenSum));

		System.out.println();
	}

	void displayReverseOddNum(int startIndex, int endIndex) {
		System.out.println("Odd numbers in reverse order is ");
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 != 0)
				System.out.println(index);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.displayEvenNumber(10, 15);
		assignment_7.displayNumberDivBy5(10, 30);
		assignment_7.displayNumberDivBy5and3(5, 18);
		assignment_7.displayNumberDivBy7or13(5, 40);
		assignment_7.displaySum(1, 5);
		assignment_7.displayDiff(3, 9);
		assignment_7.displayReverseOddNum(10, 20);
	}
}
