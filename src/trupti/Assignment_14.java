package trupti;

public class Assignment_14 {

	void toFindMaxNo(int[] num) {
		int maxNo = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] > maxNo)
				maxNo = num[index];
		}
		System.out.println("Maximum number in array is: " + maxNo);
	}

	void toFindMinNo(int[] num) {
		int minNo = 99;
		for (int index = 0; index < num.length; index++) {
			if (num[index] < minNo)
				minNo = num[index];
		}
		System.out.println("Minimum number in array is: " + minNo);
	}

	void diffBetMaxAndMinNo(int[] diffNo) {
		int max = 0;
		int min = 100;
		int diffNumber = 0;
		for (int index = 0; index < diffNo.length; index++) {
			if (diffNo[index] > max) {
				max = diffNo[index];
			}
		}
		System.out.println("Max no is; " + max);

		for (int index = 0; index < diffNo.length; index++) {
			if (diffNo[index] < min) {
				min = diffNo[index];
			}
		}
		System.out.println("Min no is; " + min);

		diffNumber = max - min;
		System.out.println("Difference between max and min no is: " + diffNumber);
	}

	void diffBetOddAndEvenNo(int[] diffOddEven) {
		int odd = 0;
		int even = 0;
		int diff = 0;

		for (int index = 0; index < diffOddEven.length; index++) {
			if (diffOddEven[index] % 2 == 0) {
				even = diffOddEven[index];
				if (diffOddEven[index] > even)
					even = diffOddEven[index];
				} else {
				// for(int index=0; index<diffOddEven.length; index++) {
				if (diffOddEven[index] % 2 != 0)
					if (diffOddEven[index] > odd)
						odd = diffOddEven[index];
				}
		}
		System.out.println(" Max even no is: " + even);
		System.out.println(" Max odd no is: " + odd);
		diff = odd - even;
		System.out.println("Difference between max odd and max even no is: " + diff);
	}

	public static void main(String[] args) {
		Assignment_14 assignment_14_1 = new Assignment_14();
		int[] maxInput = { 1, 11, 44, 23, 55, 99, 23 };
		assignment_14_1.toFindMaxNo(maxInput);

		System.out.println("-----------------------------------");

		Assignment_14 assignment_14_2 = new Assignment_14();
		int[] minInput = { 1, 11, 44, 23, 55, 99, 23 };
		assignment_14_2.toFindMinNo(minInput);

		System.out.println("-----------------------------------");

		Assignment_14 assignment_14_3 = new Assignment_14();
		int[] diffInput = { 1, 11, 44, 23, 55, 99, 23 };
		assignment_14_3.diffBetMaxAndMinNo(diffInput);

		System.out.println("-----------------------------------");

		Assignment_14 assignment_14_4 = new Assignment_14();
		int[] diffOddEvenInput = { 1, 11, 44, 23, 55, 99, 23 };
		assignment_14_4.diffBetOddAndEvenNo(diffOddEvenInput);
	}
}
