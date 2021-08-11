package siddharth;

public class Assignment7 {

	void even() {
		System.out.println("\n");
		for (int index = 10; index <= 15; index++) {
			if (index % 2 == 0)
				System.out.println("Even numbers are: " + index);
		}
	}

	void divisibleby5() {
		System.out.println("\n");
		for (int index = 10; index <= 30; index++) {
			if (index % 5 == 0)
				System.out.println("Number divisible by 5 are: " + index);
		}
	}

	void divisibleby5and3() {
		System.out.println("\n");
		for (int index = 5; index <= 18; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println("Numbers divisible by 5 & 3 are: " + index);
		}
	}

	void divisibleBy7or13(int startIndex, int endIndex) {
		System.out.println("\n");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + " is divisible by 13");
			}

		}
	}

	void sum() {
		System.out.println("\n");
		int sum = 0;
		for (int index = 1; index <= 5; index++) {
			sum = sum + index;
		}
		System.out.println("Sum is " + sum);
	}

	void difference(int startIndex, int endIndex) {
		System.out.println("\n");
		int odd = 0;
		int even = 0;
		int diff;

		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 != 0) {
				odd = odd + index;
			} else if (index % 2 == 0) {
				even = even + index;
			}
		}
		diff = odd - even;
		System.out.println("Difference between odd & even is: " + diff);
	}

	void reverseOdd(int startIndex, int endIndex) {
		System.out.println("\n");
		for (int index = startIndex; index >= endIndex; index--) {
			if (index % 2 != 0) {
				System.out.println("Odd numbers in reverse order:" + index);
			}

		}

	}

	public static void main(String[] a) {
		Assignment7 assignment7 = new Assignment7();
		assignment7.even();
		assignment7.divisibleby5();
		assignment7.divisibleby5and3();
		assignment7.divisibleBy7or13(7, 40);
		assignment7.sum();
		assignment7.difference(3, 9);
		assignment7.reverseOdd(20, 10);
	}

}
