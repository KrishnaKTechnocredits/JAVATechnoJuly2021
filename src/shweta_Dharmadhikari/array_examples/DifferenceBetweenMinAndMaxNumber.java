package shweta_Dharmadhikari.array_examples;

public class DifferenceBetweenMinAndMaxNumber {
	int[] input = { 1, 11, 44, 23, 55, 99, 23, 22 };
	int index = 0;
	int max = input[index];
	int min = input[index];

	int diffBetweenMaxOddAndMaxEvenNumber() {
		for (; index < input.length; index++) {
			if (input[index] > max && input[index] % 2 == 0)
				max = input[index];
			else if (input[index] > min && input[index] % 2 != 0)
				min = input[index];
		}
		if (max > min)
			return max - min;
		else
			return min - max;
	}

	public static void main(String[] args) {
		DifferenceBetweenMinAndMaxNumber differenceBetweenMinAndMaxNumber = new DifferenceBetweenMinAndMaxNumber();
		System.out.println("Difference between max odd number and max even number is :"
				+ differenceBetweenMinAndMaxNumber.diffBetweenMaxOddAndMaxEvenNumber());
	}
}
