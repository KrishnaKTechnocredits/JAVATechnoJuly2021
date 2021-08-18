package monali;

public class EvenandOddSumDiff {

	/*
	 * program 3 : return difference between sum of even number - sum of odd
	 * numbers. Difference has to be positive. print the answer in main method.
	 * int[] arr = {12,2,13,9} hint : 22 - 14 = 8 output : 8 int[] arr =
	 * {13,22,10,3} hint : 32 - 16 = 16 output : 16
	 */
	int getEvenAndOddSumDiff(int[] input) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				evenSum += input[index];
			else
				oddSum += input[index];
		}

		if (evenSum > oddSum) {
			evenSum = evenSum - oddSum;
			return evenSum;
		} else {
			oddSum = oddSum - evenSum;
			return oddSum;
		}
	}

	public static void main(String[] args) {
		EvenandOddSumDiff evensum = new EvenandOddSumDiff();
		int[] arr = { 12, 2, 13, 9 };
		System.out.println("Difference between even and odd sum is : " + evensum.getEvenAndOddSumDiff(arr));
		int[] arr2 = { 13, 22, 10, 3 };
		System.out.println("Difference between even and odd sum is : " + evensum.getEvenAndOddSumDiff(arr2));
	}

}
