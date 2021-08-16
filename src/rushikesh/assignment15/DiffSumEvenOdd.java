package rushikesh.assignment15;

public class DiffSumEvenOdd {
	int getDifferenceSumEvenSumOdd(int[] input) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				sumEven += input[index];
			else
				sumOdd += input[index];
		}
		if (sumEven > sumOdd)
			return sumEven - sumOdd;
		else
			return sumOdd - sumEven;
	}

	public static void main(String[] args) {
		int[] input = { 12, 2, 13, 9 };
		DiffSumEvenOdd diffSumEvenOdd = new DiffSumEvenOdd();
		System.out.print("Difference between sum of even number and sum of odd numbers is ");
		System.out.println(diffSumEvenOdd.getDifferenceSumEvenSumOdd(input));
		int[] input1={13,22,10,3};
		System.out.print("Difference between sum of even number and sum of odd numbers is ");
		System.out.println(diffSumEvenOdd.getDifferenceSumEvenSumOdd(input1));
	}
}
