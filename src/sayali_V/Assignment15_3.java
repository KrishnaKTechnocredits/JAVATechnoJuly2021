/*
 return difference between sum of even number-sum of odd number.
  */

package sayali_V;

public class Assignment15_3 {

	int getDifferenceSumEvenSUmOdd(int[] input) {
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
		Assignment15_3 assignment = new Assignment15_3();
		System.out.println("diff between sum of even number and sum of odd number is "
				+ assignment.getDifferenceSumEvenSUmOdd(input));
		int[] input1 = { 13, 22, 10, 3 };
		System.out.println("diff between sum of even number and sum of odd number is "
				+ assignment.getDifferenceSumEvenSUmOdd(input1));
	}

}
