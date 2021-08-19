// return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method
package shreya;

public class EvenOddDiffrenceInArray {
	int evenSumOddSumDiff(int[] num) {
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0)
				evenSum = evenSum + num[index];
			else
				oddSum = oddSum + num[index];
		}
		if (evenSum > oddSum)
			return evenSum - oddSum;
		else
			return oddSum - evenSum;
	}

	public static void main(String[] args) {
		int input[] = { 12, 2, 13, 9 };
		EvenOddDiffrenceInArray evenOddDifferenceInArray = new EvenOddDiffrenceInArray();
		int sumOfDifference = evenOddDifferenceInArray.evenSumOddSumDiff(input);
		System.out.println("Difference between sum of even number and odd number for int[] arr={12,2,13,9} is  "
				+ sumOfDifference);
		int input1[] = { 13, 22, 10, 3 };
		EvenOddDiffrenceInArray evenOddDifferenceInArray1 = new EvenOddDiffrenceInArray();
		int sumOfDifference1 = evenOddDifferenceInArray1.evenSumOddSumDiff(input1);
		System.out.println("Difference between sum of even number and odd number for int[] arr={13,22,10,3} is  "
				+ sumOfDifference1);

	}

}
