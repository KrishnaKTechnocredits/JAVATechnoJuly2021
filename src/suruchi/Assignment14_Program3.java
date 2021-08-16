package suruchi;

public class Assignment14_Program3 {

	int getMaxNumber(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				max = arr[index];
			}
		}
		return max;
	}

	int getMinNumber(int[] arr) {
		int min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < min) {
				min = arr[index];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Assignment14_Program3 assignment14_Program3 = new Assignment14_Program3();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Array of numbers is: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + " ");
		System.out.println();
		System.out.println("Maximum number from the array is: " + assignment14_Program3.getMaxNumber(input));
		System.out.println("Minimum number from the array is: " + assignment14_Program3.getMinNumber(input));
		int diff = assignment14_Program3.getMaxNumber(input) - assignment14_Program3.getMinNumber(input);
		System.out.println("Difference between maximum and minimum number from the array is: " + diff);
	}
}