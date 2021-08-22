package apurva;

public class Assignment_7 {

	void printEvenNumbers(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	void verifyDivisibility(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void verifyDivisibilityofTwoNumbers(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	void verifyDivisibilitybyOrOperator(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0 || index % 13 == 0) {

				if (index % 7 == 0) {
					System.out.println(index + " is divisible by 7");
				}
				if (index % 13 == 0) {
					System.out.println(index + " is divisible by 13");
				}
			}
		}
	}

	void totalSumofIndex(int startIndex, int endIndex) {
		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			sum = sum + index;

		}
		System.out.println(sum);
	}

	void totalSumofOddandEvenNumbers(int startIndex, int endIndex) {
		int evenSum = 0;
		int oddSum = 0;
		int total;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				evenSum = evenSum + index;
			} else {
				oddSum = oddSum + index;
			}
		}
		System.out.println("Sum of even numbers is : " + evenSum);
		System.out.println("Sum of odd numbers is : " + oddSum);
		total = oddSum - evenSum;
		System.out.println("Difference of both: " + total);

	}

	void reverseOddNumbers(int startIndex, int endIndex) {
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 2 != 0) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_7 assign = new Assignment_7();
		System.out.println("\n" + "Even numbers are");
		assign.printEvenNumbers(10, 15);

		Assignment_7 assign1 = new Assignment_7();
		System.out.println("\n" + "Numbers divisible by 5 are: ");
		assign1.verifyDivisibility(10, 30);

		Assignment_7 assign2 = new Assignment_7();
		System.out.println("\n" + "Number divisible by 5 & 3 is: ");
		assign2.verifyDivisibilityofTwoNumbers(5, 18);

		Assignment_7 assign3 = new Assignment_7();
		System.out.println("\n" + "Number divisible by 7 or 13 is: ");
		assign3.verifyDivisibilitybyOrOperator(5, 40);

		Assignment_7 assign4 = new Assignment_7();
		System.out.println("\n" + "Total sum of numbers within range 1 to 5:  ");
		assign4.totalSumofIndex(1, 5);

		Assignment_7 assign5 = new Assignment_7();
		System.out.println("\n" + "Difference  of odd and even numbers within range: ");
		assign5.totalSumofOddandEvenNumbers(3, 9);

		Assignment_7 assign6 = new Assignment_7();
		System.out.println("\n" + "Odd numbers in reverse order: ");
		assign6.reverseOddNumbers(10, 20);
	}
}