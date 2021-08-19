package umakant;

public class Assignment14_4 {

	int getDifferenceOfOddAndEvenMax(int[] input) {
		int evenMax = 0;
		int oddMax = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				if (input[index] > evenMax)
					evenMax = input[index];
			} else {
				if (input[index] > oddMax)
					oddMax = input[index];
			}
		}
		return Math.abs(evenMax - oddMax);
	}
	
	public static void main(String[] args) {
		Assignment14_4 assignment14_4 = new Assignment14_4();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.print(assignment14_4.getDifferenceOfOddAndEvenMax(input));
	}

}
