package amol_Pawar;

public class Assignment_7 {

	void getEvenNumbers(int startNum, int endNum) {
		System.out.println("Programme to check whether number is even or not with start index as " + startNum
				+ " and end index as " + endNum);
		for (int index = startNum; index <= endNum; index++) {

			if (index % 2 == 0) {
				System.out.print(index + ",");
			}
		}
		System.out.println(" are even numbers");
	}

	void getNumDivisibleBy5(int startNum, int endNum) {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Programme to check whether number is divisible 5 or not with start index as " + startNum
				+ " and end index as " + endNum);
		int index = startNum;
		for (; index <= endNum; index++) {
			if (index % 5 == 0) {
				System.out.print(index + ",");
			}
		}
		System.out.println(" are divisible by 5");
	}

	void getNumDivisibleBy5And3(int startNum, int endNum) {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Programme to check whether number is divisible 5 and 3 with start index as " + startNum
				+ " and end index as " + endNum);
		for (int index = startNum; index <= endNum; index++) {
			if ((index % 3 == 0) && (index % 5 == 0)) {
				System.out.print(index + " ");
			}
		}
		System.out.println(" divisible by both 3 & 5");
	}

	void getNumDivisibleBy13or7(int startNum, int endNum) {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Programme to check whether number is divisible 7 or 3 with start index as " + startNum
				+ " and end index as " + endNum);
		for (int index = startNum; index <= endNum; index++) {
			
			if ((index % 7 == 0) || (index % 13 == 0)) {
				if (index % 7 == 0) {
					System.out.println(index + " is divisible by 7");
				} else {
					System.out.println(index + " is divisible by 13");
				}
			}
		}

	}

	void getSumOfNum(int startNum, int endNum) {
		System.out.println("----------------------------------------------------------------------");
		int temp = 0;
		for (int index = 0; index <= endNum; index++) {
			temp = temp + index;
		}
		System.out.println("Sum of number with range " + startNum + " to " + endNum + " is " + temp);
	}

	void getSumOfOddAndEvenNum(int startNum, int endNum) {
		System.out.println("----------------------------------------------------------------------");

		int even = 0;
		int odd = 0;
		for (int index = startNum; index <= endNum; index++) {

			if (index % 2 == 0) {
				even = even + index;

			} else {
				odd = odd + index;
			}
		}
		int diff = odd - even;
		System.out.println("difference between sum of odd number " + odd + " and even number " + even + " is " + diff);
	}

	void getOddNumReverseOrder(int startNum, int endNum) {

		System.out.println("----------------------------------------------------------------------");
		System.out.println("Odd number in reverse order are");
		for (int index = endNum; index >= startNum; index--) {
			if (index % 2 != 0) {
				System.out.print(index + ",");
			}
		}
	}

	public static void main(String[] args) {
		Assignment_7 assignment_7 = new Assignment_7();
		assignment_7.getEvenNumbers(10, 15);
		assignment_7.getNumDivisibleBy5(10, 30);
		assignment_7.getNumDivisibleBy5And3(5, 18);
		assignment_7.getNumDivisibleBy13or7(5, 40);
		assignment_7.getSumOfNum(1, 5);
		assignment_7.getSumOfOddAndEvenNum(3, 9);
		assignment_7.getOddNumReverseOrder(10, 20);
	}
}
