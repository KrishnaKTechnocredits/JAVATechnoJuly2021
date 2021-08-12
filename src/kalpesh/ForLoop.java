package kalpesh;

public class ForLoop {

	void evenNumbers(int startindex, int endindex) {
		System.out.println("Even Numbers are: ");
		for (int index = startindex; index <= endindex; index++) {
			if (index % 2 == 0) {
				System.out.println(index);

			}

		}
	}

	void divisibleByFive(int startindex, int endindex) {
		System.out.println("\nDivisible by 5, numbers are: ");
		for (int index = startindex; index <= endindex; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	void divisibleByFiveAndDivisibleByThree(int startindex, int endindex) {
		System.out.println("\nDivisible by 5 & 3, numbers are: ");
		for (int index = startindex; index <= endindex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println(index);
			}

		}
	}

	void divisibleBySevenOrThirteen(int startindex, int endindex) {
		System.out.println();
		for (int index = startindex; index <= endindex; index++) {
			if (index % 7 == 0 || index % 13 == 0) {
				if (index % 7 == 0) {
					System.out.println(index + " is divisible by 7");
				} else if (index % 13 == 0) {
					System.out.println(index + " is divisible by 13");
				}

			}
		}

	}

	void sumOfAllNumbers(int startindex, int endindex) {
		int sum = 0;
		for (int index = startindex; index <= endindex; index++) {
			sum = sum + index;
		}
		System.out.println("\nSum Is " + sum);

	}

	void reverseOrder(int startindex, int endindex) {
		System.out.println();
		for (int index = startindex; index >= endindex; index--) {
			if (index % 2 != 0) {
				System.out.println(index);
			}
		}
	}

	void differenceBetweenEvenAndOdd(int startindex, int endindex) {
		System.out.println();
		int sumodd = 0;
		int sumeven = 0;
		int sum = 0;
		for (int index = startindex; index <= endindex; index++) {
			if (index % 2 == 0) {
				sumeven = sumeven + index;
			} else {
				sumodd = sumodd + index;
			}
			sum = sumodd - sumeven;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		ForLoop forloop = new ForLoop();
		forloop.evenNumbers(10, 15);
		forloop.divisibleByFive(10, 30);
		forloop.divisibleByFiveAndDivisibleByThree(5, 18);
		forloop.divisibleBySevenOrThirteen(5, 40);
		forloop.sumOfAllNumbers(1, 5);
		forloop.reverseOrder(20, 10);
		forloop.differenceBetweenEvenAndOdd(3, 9);

	}

}
