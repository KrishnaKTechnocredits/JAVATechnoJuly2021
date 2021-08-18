package suruchi;

public class Assignment14_Program2 {

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
		Assignment14_Program2 assignment14_Program2 = new Assignment14_Program2();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.println("Array of numbers is: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + " ");
		System.out.println();
		System.out.println("Minimum number from the array is: " + assignment14_Program2.getMinNumber(input));
	}
}