package monali;

public class DiffBtwnMaxOddAndEvenNum {

	int getDiffBtwnMaxOddAndEvenNum(int[] input) {
		int maxOdd = 0;
		int maxEven = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				if (input[index] > maxEven)
					maxEven = input[index];
			} else {
				if (input[index] > maxOdd)
					maxOdd = input[index];
			}

		}
		if (maxEven > maxOdd)
			return maxEven - maxOdd;
		else
			return maxOdd - maxEven;
	}

	public static void main(String[] args) {
		DiffBtwnMaxOddAndEvenNum diffBtwnOddandEven = new DiffBtwnMaxOddAndEvenNum();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println(diffBtwnOddandEven.getDiffBtwnMaxOddAndEvenNum(input));

	}
}
