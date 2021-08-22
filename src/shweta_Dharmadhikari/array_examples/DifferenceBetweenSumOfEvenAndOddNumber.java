package shweta_Dharmadhikari.array_examples;

public class DifferenceBetweenSumOfEvenAndOddNumber {

	int getDifferencebetweenNumber(int[] arr) {
		int evenSum = 0;
		int oddSum = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0)
				evenSum += arr[index];
			else
				oddSum += arr[index];
		}
		if (evenSum > oddSum)
			return evenSum - oddSum;
		else
			return oddSum - evenSum;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 2, 13, 9 };
		DifferenceBetweenSumOfEvenAndOddNumber differenceBetweenSumOfEvenAndOddNumber = new DifferenceBetweenSumOfEvenAndOddNumber();
		System.out.println("Difference between sum of even number and sum of odd numbers is: "
				+ differenceBetweenSumOfEvenAndOddNumber.getDifferencebetweenNumber(arr));

	}

}
