package manaswi;
public class Assignment_15_Program_3 {

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
		Assignment_15_Program_3 assignment_15_Program_3 = new Assignment_15_Program_3();
		System.out.println("Difference between sum of even number and sum of odd numbers is "
				+ assignment_15_Program_3.getDifferenceSumEvenSumOdd(input));
		int[] input1={13,22,10,3};
		System.out.println("Difference between sum of even number and sum of odd numbers is "
				+ assignment_15_Program_3.getDifferenceSumEvenSumOdd(input1));
	}

}