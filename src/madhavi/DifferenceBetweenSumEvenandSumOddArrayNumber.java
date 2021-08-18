package madhavi;

public class DifferenceBetweenSumEvenandSumOddArrayNumber {
	int getDiffBetweenEvenOdd(int[] input) {
		int sumEven = 0;
		int sumodd = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				sumEven = sumEven + input[index];
			} else {
				sumodd = sumodd + input[index];
			}
		}

		return Math.abs(sumEven - sumodd);

	}

	public static void main(String[] args) {

		DifferenceBetweenSumEvenandSumOddArrayNumber differenceBetweenSumEvenandSumOddArrayNumber = new DifferenceBetweenSumEvenandSumOddArrayNumber();

		System.out.println("Difference between sum of even number - sum of odd numbers");
		int[] arr1 = { 12, 2, 13, 9 };
		System.out.println(differenceBetweenSumEvenandSumOddArrayNumber.getDiffBetweenEvenOdd(arr1));
		int[] arr2 = { 13, 22, 10, 3 };
		System.out.println(differenceBetweenSumEvenandSumOddArrayNumber.getDiffBetweenEvenOdd(arr2));

	}
}
