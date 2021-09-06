package nasir_Assignment_28;

public class Assignment_28 {
	int getSecondHighestElement(int[] input) {
		int highestElement = input[0];
		int secondHighestElement = input[1];
		for (int index = 2; index < input.length; index++) {
			if (input[index] > highestElement) {
				secondHighestElement = highestElement;
				highestElement = input[index];
			} else if (input[index] > secondHighestElement)
				secondHighestElement = input[index];
		}
		return secondHighestElement;
	}

	int getNthHigestElementFromArray(int[] input) {
		int max = input[0];
		int maxElementIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max) {
				max = input[index];
				maxElementIndex = index;
			}
		}
		input[maxElementIndex] = 0;
		return max;
	}

	public static void main(String[] args) {
		int[] input = { 10, 23, 2, 11, 55, 43, 99 };
		Assignment_28 assignment_28 = new Assignment_28();
		System.out.println("Second highest number from give array is " + assignment_28.getSecondHighestElement(input));
		assignment_28.getNthHigestElementFromArray(input);
		assignment_28.getNthHigestElementFromArray(input);
		System.out.println(
				"Third highest number from given array is " + assignment_28.getNthHigestElementFromArray(input));
	}

}
