package monika;

public class Assignment15_Program_3 {

	int getDifferenceSumEvenSumOdd(int[] num) {
		int sumEven = 0;
		int sumOdd = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0)
				sumEven += num[index];
			else
				sumOdd += num[index];
		}
		if (sumEven > sumOdd)
			return sumEven - sumOdd;
		else
			return sumOdd - sumEven;
	}

	public static void main(String[] args) {
		int[] input = { 12, 2, 13, 9 };
		Assignment15_Program_3 assignment15_Program_3 = new Assignment15_Program_3();
		System.out.println("Difference between sum of even number and sum of odd numbers is "
				+ assignment15_Program_3.getDifferenceSumEvenSumOdd(input));
		int[] input1={13,22,10,3};
		System.out.println("Difference between sum of even number and sum of odd numbers is "
				+ assignment15_Program_3.getDifferenceSumEvenSumOdd(input1));
	}
}
