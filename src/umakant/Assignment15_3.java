package umakant;

public class Assignment15_3 {

	int getDifferenceOfSumOfOddAndEven(int[] input) {
		int sumOfOddNumbers = 0;
		int sumOfEvenNumbers = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				sumOfEvenNumbers += input[index];
			else
				sumOfOddNumbers += input[index];
		}
		return Math.abs(sumOfEvenNumbers - sumOfOddNumbers);
	}

	public static void main(String[] args) {
		Assignment15_3 assignment15_3 = new Assignment15_3();
		int[] input1 = { 12, 2, 13, 9 };
		int[] input2 = { 13, 22, 10, 3 };
		System.out.println(assignment15_3.getDifferenceOfSumOfOddAndEven(input1));
		System.out.println(assignment15_3.getDifferenceOfSumOfOddAndEven(input2));
	}

}
