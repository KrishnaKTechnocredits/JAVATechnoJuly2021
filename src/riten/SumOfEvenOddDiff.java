package riten;

class SumOfEvenOddDiff {

	int sumEven = 0;
	int sumOdd = 0;
	int diff = 0;

	int returnEven(int[] arr) {
		int even = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				even = even + arr[index];
				sumEven = even;
			}
		}
		return sumEven;
	}

	int returnOdd(int[] arr) {
		int odd = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 != 0) {
				odd = odd + arr[index];
				sumOdd = odd;
			}

		}
		return sumOdd;

	}

	void returnDiff() {
		if (sumEven > sumOdd) {
			diff = sumEven - sumOdd;
		} else {
			diff = sumOdd - sumEven;
		}
		System.out.println("Diffrence between even and odd count is " + diff);

	}

	public static void main(String[] args) {
		SumOfEvenOddDiff diffoddeven = new SumOfEvenOddDiff();
		int[] input = { 13,22,10,3 };
		System.out.println("Even num count is " + diffoddeven.returnEven(input));
		System.out.println("Odd num count is " + diffoddeven.returnOdd(input));
		diffoddeven.returnDiff();
	}
}