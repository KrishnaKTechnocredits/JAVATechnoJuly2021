package manaswi;

public class Assignment_14_Program1 {

	int getMaxNumber(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				max = arr[index];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Assignment_14_Program1 assignment_14_Program1 = new Assignment_14_Program1();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Array of numbers is: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + " ");
		System.out.println();
		System.out.println("Maximum number from the array is: " + assignment_14_Program1.getMaxNumber(input));
	}
}