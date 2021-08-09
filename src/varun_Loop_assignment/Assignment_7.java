package varun_Loop_assignment;

public class Assignment_7 {
	int sum = 0;
	int even = 0;
	int odd = 0;
	int difference;

	void printEvenNumer(int startIndex, int endIndex) {
		System.out.println("Number which are even in given range are");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
		System.out.println("**************************");
	}

	void numberDivisbleBy5(int startIndex, int endIndex) {
		System.out.println("Number which are divisible by 5 in given range are");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
		System.out.println("**************************");
	}

	void numberDivisbleBy3and5(int startIndex, int endIndex) {
		System.out.println("Number which are divisible by 3&5 in given range are");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println(index);
			}
		}
		System.out.println("**************************");
	}

	void numberDivisibleBy7or13(int startIndex, int endIndex) {
		System.out.println("Numbers which are divisible by 7 or 13 in given range are");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0 || index % 13 == 0) {
				System.out.println(index);
			}
		}
		System.out.println("**************************");
	}

	void sumOfAllNumberInGivenRange(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			sum = sum + index;
		}
		System.out.println("Sum of all the numbers from given range is " + sum);
		System.out.println("**************************");
	}

	void differenceBetweenSumandOddNumer(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				even = even + index; // 4//6//8
			} else
				odd = odd + index; // 3//5//7//9
		}
		difference = odd - even;
		System.out.println("Difference of even and odd number from given range is " + difference);
		System.out.println("**************************");
	}

	void oddNumberInReverseOrder(int startIndex, int endIndex) {
		System.out.println("Odd Number in reverse order are");
		for (int index = endIndex; index > startIndex; index--) {
			if (index % 2 != 0) {
				System.out.println(+index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.printEvenNumer(10, 15);
		assignment_7.numberDivisbleBy5(10, 30);
		assignment_7.numberDivisbleBy3and5(5, 18);
		assignment_7.numberDivisibleBy7or13(5, 40);
		assignment_7.sumOfAllNumberInGivenRange(1, 5);
		assignment_7.differenceBetweenSumandOddNumer(3, 9);
		assignment_7.oddNumberInReverseOrder(10, 20);
	}
}
