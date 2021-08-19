package deven_dc.assign;

public class Assignment15_p3 {
	int getDiffSumOfEvenOdd(int[] input) {
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
		Assignment15_p3 a15_p3 = new Assignment15_p3();
		System.out.println("Difference Between Sum of Even No.& Sum of Odd No.= " +a15_p3.getDiffSumOfEvenOdd(input));
		int[] input1={13,22,10,3};
		System.out.println("Difference Between Sum of Even No.& Sum of Odd No.= " +a15_p3.getDiffSumOfEvenOdd(input1));
	}

}
