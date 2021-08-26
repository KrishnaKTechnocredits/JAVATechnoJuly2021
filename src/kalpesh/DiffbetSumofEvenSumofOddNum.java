package kalpesh;

public class DiffbetSumofEvenSumofOddNum {
	int finddifference(int[] numarr) {
		int evenSum = 0;
		int oddSum = 0;

		for (int index = 0; index < numarr.length; index++) {
			if (numarr[index] % 2 == 0)
				evenSum = evenSum + numarr[index];
			else
				oddSum = oddSum + numarr[index];
		}
		if (evenSum > oddSum)
			return evenSum - oddSum;
		else
			return oddSum - evenSum;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 2, 13, 9 };

		DiffbetSumofEvenSumofOddNum difference = new DiffbetSumofEvenSumofOddNum();
		System.out.println(
				"Difference between sum of even number - sum of odd numbers is " + difference.finddifference(arr));
	}
}

/*
 * program 3 : return difference between sum of even number - sum of odd
 * numbers. Difference has to be positive. print the answer in main method.
 * int[] arr = {12,2,13,9} hint : 22 - 14 = 8 output : 8
 */
