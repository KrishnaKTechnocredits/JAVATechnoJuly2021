package husain;

public class Assignment_7 {

	void printEvenNumbers(int startRange, int endRange) {
		int index = startRange;
		System.out.println("The list of even numbers between " + startRange + " and " + endRange + " is: ");
		for (; index <= endRange; index++) {
			if (index % 2 == 0) {
				System.out.print(index + " ");
			}
		}
		System.out.println("");
	}

	void printNumbersDivisibleBy5(int startRange, int endRange) {
		System.out.println("");
		System.out.println("The list of numbers divisible by 5 between " + startRange + " and " + endRange + " is: ");
		int index = startRange;
		for (; index <= endRange; index++) {
			if (index % 5 == 0) {
				System.out.print(index + " ");
			}
		}
		System.out.println("");
	}

	void printNumbersDivisibleby3And5(int startRange, int endRange) {
		System.out.println("");
		System.out.println(
				"The list of numbers divisible by 3 and 5 between " + startRange + " and " + endRange + " is: ");
		int index = startRange;
		for (; index <= endRange; index++) {
			if (index % 3 == 0 && index % 5 == 0) {
				System.out.println(index + " is divisible by 3 and 5");
			}
		}
	}

	void printNumbersDivisibleby7or13(int startRange, int endRange) {
		System.out.println("");
		System.out.println(
				"The list of numbers divisible by 7 or 13 between " + startRange + " and " + endRange + " is: ");
		int index = startRange;
		for (; index <= endRange; index++) {
			if (index % 7 == 0 && index % 13 == 0) {
				System.out.println(index + " is divisible by 7 and 13");
			} else if (index % 7 == 0) {
				System.out.println(index + " is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + " is divisible by 13");
			}
		}
	}

	void printSum(int startRange, int endRange) {
		int index = startRange;
		int sum = 0;
		System.out.println("");
		for (; index <= endRange; index++) {
			sum += index;
		}
		System.out.println("The sum of numbers between " + startRange + " and " + endRange + " is: " + sum);
	}

	void printDifference(int startRange, int endRange) {
		int index = startRange;
		int oddSum = 0;
		int evenSum = 0;
		System.out.println("");
		for (; index <= endRange; index++) {
			if (index % 2 == 0) {
				evenSum += index;
			} else {
				oddSum += index;
			}

		}
		int difference = oddSum - evenSum;
		System.out.println("The difference between sum of even numbers and sum of odd numbers between " + startRange
				+ " and " + endRange + " is: " + difference);
	}

	void printOddinReverese(int startRange, int endRange) {
		int index = endRange;
		System.out.println("");
		System.out.println("The list of odd numbers in reverse between " + startRange + " and " + endRange + " is: ");
		for (; index >= startRange; index--) {
			if (index % 2 != 0) {
				System.out.print(index + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_7 obj = new Assignment_7();
		obj.printEvenNumbers(10, 15);
		obj.printNumbersDivisibleBy5(10, 30);
		obj.printNumbersDivisibleby3And5(5, 18);
		obj.printNumbersDivisibleby7or13(5, 40);
		obj.printSum(1, 5);
		obj.printDifference(3, 9);
		obj.printOddinReverese(10, 20);
	}

}
