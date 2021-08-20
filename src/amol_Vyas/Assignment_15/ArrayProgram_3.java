/*
program 3 : return difference between sum of even number - sum of odd numbers. Difference has to be positive. print the answer in main method.
int[] arr = {12,2,13,9}
hint : 22 - 14 = 8
output : 8 
int[] arr = {13,22,10,3}
hint : 32 - 16 = 16
output : 16
 */

package amol_Vyas.Assignment_15;

public class ArrayProgram_3 {

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
		ArrayProgram_3 arrayProgram_3 = new ArrayProgram_3();
		System.out.println("Difference between sum of even number and sum of odd numbers is "
				+ arrayProgram_3.getDifferenceSumEvenSumOdd(input));
		int[] input1={13,22,10,3};
		System.out.println("Difference between sum of even number and sum of odd numbers is "
				+ arrayProgram_3.getDifferenceSumEvenSumOdd(input1));
	}

}
