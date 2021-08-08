package madhavi;

public class Assignment_7 {
	void findEvenNumbers(int startIndex, int endIndex) {
		for (; startIndex <= endIndex; startIndex++) {
			if (startIndex % 2 == 0) {
				System.out.println(startIndex);
			}
		}
	}

	void findNumbersDivisibleByFive(int startIndex, int endIndex) {
		for (; startIndex <= endIndex; startIndex++) {
			if (startIndex % 5 == 0) {
				System.out.println(startIndex);
			}
		}
	}

	void findNumbersDivisibleByFiveAndThree(int startIndex, int endIndex) {
		for (; startIndex <= endIndex; startIndex++) {
			if (startIndex % 5 == 0 && startIndex % 3 == 0) {
				System.out.println(startIndex);
			}
		}
	}

	// Approach 1 for method 4
	void findNumbersDivisibleBySevenOrThirteen_1(int startIndex, int endIndex) {
		for (; startIndex <= endIndex; startIndex++) {
			if (startIndex % 7 == 0) {
				System.out.println(startIndex + " is divisible by 7");

			} else if (startIndex % 13 == 0) {
				System.out.println(startIndex + " is divisible by 13");
			}

		}
	}

	// Approach 2 for method 4
	void findNumbersDivisibleBySevenOrThirteen_2(int startIndex, int endIndex) {
		for (; startIndex <= endIndex; startIndex++) {
			if (startIndex % 7 == 0 || startIndex % 13 == 0) {

				if (startIndex % 7 == 0) {
					System.out.println(startIndex + " is divisible by 7");
				} else {
					System.out.println(startIndex + " is divisible by 13");
				}
			}

		}
	}

	void findsum(int startIndex, int endIndex) {
		int sum = 0;
		for (; startIndex <= endIndex; startIndex++) {
			sum = sum + startIndex;
		}
		System.out.println("sum is " + sum);
	}

	void diffEvenOddNumbers(int startIndex, int endIndex) {
		int sumofevennum = 0;
		int sumofoddnum = 0;
		for (; startIndex <= endIndex; startIndex++) {
			if (startIndex % 2 == 0) {
				sumofevennum = sumofevennum + startIndex;
			} else {
				sumofoddnum = sumofoddnum + startIndex;
			}
		}
		System.out.println("output " + (sumofoddnum - sumofevennum));
	}

	void oddNumberReverse(int startIndex, int endIndex) {
		for (; endIndex >= startIndex; endIndex--) {
			if(endIndex % 2 !=0) 
				System.out.println(endIndex);
		}
	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		System.out.println("1.Even numbers are:");
		assignment_7.findEvenNumbers(10, 15);
		System.out.println("--------------------------------------------");
		System.out.println("2.Divisible by 5, numbers are:");
		assignment_7.findNumbersDivisibleByFive(10, 30);
		System.out.println("--------------------------------------------");
		System.out.println("3.Divisible by 5 & 3, numbers are:");
		assignment_7.findNumbersDivisibleByFiveAndThree(5, 18);
		System.out.println("--------------------------------------------");
		System.out.println("4.Divisible by 7  or 13, numbers are:");
		assignment_7.findNumbersDivisibleBySevenOrThirteen_2(5, 40);
		System.out.println("--------------------------------------------");
		System.out.println("5.Sum of all the numbers in range between 1 to 5");
		assignment_7.findsum(1, 5);
		System.out.println("--------------------------------------------");
		System.out.println("6.Difference between sum of odd numbers and even numbers in a range 3 to 9 :");
		assignment_7.diffEvenOddNumbers(3, 9);
		System.out.println("--------------------------------------------");
		System.out.println("7.Odd numbers in reverse order:");
		assignment_7.oddNumberReverse(10, 20);
	}
}