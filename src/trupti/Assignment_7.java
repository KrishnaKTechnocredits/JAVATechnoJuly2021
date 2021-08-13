package trupti;

public class Assignment_7 {

	void evenNo(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	void noDivisibleByFive(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0) {
				System.out.println(index);
			}
		}
	}

	void noDivisibleBy5And3(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0 && index % 3 == 0) {
				System.out.println(index);
			}
		}
	}

	void noDivBy7And13(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 7 == 0) {
				System.out.println(+index + " is divisible by 7");
			} else if (index % 13 == 0) {
				System.out.println(+index + " is divisible by 13");
			}
		}
	}

	void noSum(int start, int end) {
		int sum = 0;
		for (int index = start; index <= end; index++) {
			sum = sum + index;
		}
		System.out.println("sum is " + sum);
	}

	void diffBetSumOfEvenAndOdd(int start, int end) {
		int subs = 0;
		int even = 0;
		int odd = 0;
		for (int index = start; index <= end; index++) {
			if (index % 2 == 0) {
				even = even + index;
			} else if (index % 2 != 0) {
				odd = odd + index;
			}
			subs = (odd - even);
		}
		System.out.println("Difference between sum of odd and even no is " + subs);
	}

	void oddReverseOrder(int start, int end) {
		for (int index = end; index >= start; index--) {
			if (index % 2 != 0) {
				System.out.println(+index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.evenNo(10, 15);
		System.out.println("------------------");
		assignment_7.noDivisibleByFive(10, 30);
		System.out.println("------------------");
		assignment_7.noDivisibleBy5And3(5, 18);
		System.out.println("------------------");
		assignment_7.noDivBy7And13(5, 40);
		System.out.println("------------------");
		assignment_7.noSum(1, 5);
		System.out.println("------------------");
		assignment_7.diffBetSumOfEvenAndOdd(3, 9);
		System.out.println("------------------");
		assignment_7.oddReverseOrder(10, 20);
	}

}
