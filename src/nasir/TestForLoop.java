package nasir;

public class TestForLoop {

	public void printEvenNumber(int startindex, int endindex) {

		for (int index = startindex; index <= endindex; index++) {

			if (index % 2 == 0) {

				System.out.println("Even number is: " + index);
			}

		}

	}

	public void divisibleFive(int startindex, int endindex) {
		System.out.println("----------------------------");
		for (int index = startindex; index <= endindex; index++) {
			if (index % 5 == 0) {
				System.out.println("Divisible by 5: " + index);
			}

		}

	}

	public void divisibleFiveAndThree(int startindex, int endindex) {
		System.out.println("----------------------------");
		for (int index = startindex; index <= endindex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println("Divisible by 5 and 3: " + index);

			}

		}

	}

	public void divisibleSeveOrThirteen(int startindex, int endindex) {
		System.out.println("----------------------------");
		for (int index = startindex; index <= endindex; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if(index % 13 == 0)
				System.out.println(index + " is divisible by 13");

		}

	}

	public void sumNumbers(int startindex, int endindex) {
		System.out.println("----------------------------");
		int sum = 0;
		for (int index = startindex; index <= endindex; index++) {
			sum = sum + index;
			System.out.println("Sum of all numbers is " + sum);
		}

	}

	public void differenceOfOddEven(int startindex, int endindex) {
		System.out.println("----------------------------");
		int sumOdd = 0;
		int sumEven = 0;
		for (int index = startindex; index <= endindex; index++) {
			if (index % 2 == 0) {
				sumEven = sumEven + index;
			} else {
				sumOdd = sumOdd + index;
			}
			int difference = sumOdd - sumEven;
			System.out.println("Difference of odd and even is " + difference);

		}

	}

	public void OddReverse(int startindex, int endindex) {
		System.out.println("----------------------------");
		for (int index = endindex; index >= startindex; index--) {
			if (index % 2 != 0) {
				{
					System.out.println("Difference of odd and even is " + index);
				}
			}
		}

	}

	public static void main(String[] args) {
		TestForLoop testForLoop = new TestForLoop();
		testForLoop.printEvenNumber(10, 15);
		testForLoop.divisibleFive(10, 30);
		testForLoop.divisibleFiveAndThree(5, 18);
		testForLoop.divisibleSeveOrThirteen(5, 40);
		testForLoop.sumNumbers(1, 5);
		testForLoop.differenceOfOddEven(3, 9);
		testForLoop.OddReverse(10, 20);

	}

}
