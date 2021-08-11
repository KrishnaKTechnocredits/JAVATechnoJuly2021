package himanshu;

public class Assignment_7 {

	void allEvenNumber(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				System.out.println("Print All Even Number between Range:" + " " + index);
			}
		}
	}

	void allNumbersDivisibleBy5(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0) {
				System.out.println("Number is divible by 5:" + " " + index);
			}
		}
	}

	void allNumbersDivisibleBy5and3(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println("Number is divible by 5 and 3:" + " " + index);
			}
		}
	}

	void allNumbersDivisibleBy7and13(int startIndex, int endIndex) {
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0) {
				System.out.println(index + " " + "is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(index + " " + "is divisible by 13");
			}
		}
	}

	void sumOfAllNumbers(int startIndex, int endIndex) {
		int sum = 0;
		for (int index = startIndex; index <= endIndex; index++) {
			sum = sum + index;
		}
		System.out.println("Sum Of All Number Between Range 1 and 5:" + sum);
	}

	void sumOfOddAndEvenNumbers(int startIndex, int endIndex) {
		int even = 0;
		int odd = 0;
		int differnce;
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0) {
				even = even + index;
			} else {
				odd = odd + index;
			}
		}
		differnce = odd - even;
		System.out.println("Differnce of Sum of Even and Odd Number" + differnce);

	}

	void oddNumbersInReverseOrder(int startIndex, int endIndex) {
		for (int index = startIndex; index >= endIndex; index--) {
			if (index % 2 == 1) {
				System.out.println("Odd Number In Reverse Order:" + index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.allEvenNumber(10, 14);
		assignment_7.allNumbersDivisibleBy5(10, 30);
		assignment_7.allNumbersDivisibleBy5and3(5, 18);
		assignment_7.allNumbersDivisibleBy7and13(5, 40);
		assignment_7.sumOfAllNumbers(1, 5);
		assignment_7.sumOfOddAndEvenNumbers(3, 9);
		assignment_7.oddNumbersInReverseOrder(20, 10);

	}

}
