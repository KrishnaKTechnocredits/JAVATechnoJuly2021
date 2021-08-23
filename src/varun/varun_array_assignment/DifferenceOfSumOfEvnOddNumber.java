package varun.varun_array_assignment;

public class DifferenceOfSumOfEvnOddNumber {
	int sumOfEvenNumber;
	int sumOfOddNumber;

	void evenNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				sumOfEvenNumber = sumOfEvenNumber + input[index];
			else
				sumOfOddNumber = sumOfOddNumber + input[index];
		}
		System.out.println("Sum of all the even numbers from given array is " + sumOfEvenNumber);
		System.out.println("Sum of all the odd numbers from given array is " + sumOfOddNumber);

	}
	
	int differenceOfSumOfEvenOddNumber() {
		int diff = sumOfOddNumber - sumOfEvenNumber;
		return diff;
	}

	public static void main(String[] args) {
		DifferenceOfSumOfEvnOddNumber assignment_15_2 = new DifferenceOfSumOfEvnOddNumber();
		int[] input = { 12, 2, 13, 9 };
		assignment_15_2.evenNumber(input);
		int diff = assignment_15_2.differenceOfSumOfEvenOddNumber();
		System.out.println("Difference of Sum of Even number and Odd number is "+diff);
	}
}
