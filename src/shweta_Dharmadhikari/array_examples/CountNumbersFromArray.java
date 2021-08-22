package shweta_Dharmadhikari.array_examples;

public class CountNumbersFromArray {
	int count = 0;

	int countOfPositiveNumber() {
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		for (int index = 0; index < input.length; index++) {
			if (input[index] >= 0) {
				count++;
			}
		}
		return count;
	}

	int countNumberOfZeros() {
		count = 0;
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0)
				count++;
		}
		return count;
	}

	int[] getFirstFiveSmallerNumber(int number) {
		int[] output = new int[5];
		for (int index = 0; index < output.length; index++) {
			number--;
			output[index] = number;
		}
		return output;
	}

	public static void main(String[] args) {
		CountNumbersFromArray countNumbersFromArray = new CountNumbersFromArray();
		System.out.println("Count of positive number is " + countNumbersFromArray.countOfPositiveNumber());
		System.out.println("\nCount of Zero is " + countNumbersFromArray.countNumberOfZeros());
		int num[] = countNumbersFromArray.getFirstFiveSmallerNumber(50);
		System.out.println("\nFive smaller numbers of the given numbers are ");
		for (int index = 0; index < num.length; index++) {
			System.out.print(num[index] + " ");
		}
	}
}
