package suruchi;

public class Assignment14_Program4 {

	int getMaxEvenNumber(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				if (arr[index] % 2 == 0)
					max = arr[index];
			}
		}
		return max;
	}

	int getMaxOddNumber(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				if (arr[index] % 2 != 0)
					max = arr[index];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Assignment14_Program4 assignment14_Program4 = new Assignment14_Program4();
		int[] input = { 1, 11, 44, 23, 55, 99, 23, 22 };
		System.out.println("Array of numbers is: ");
		for (int index = 0; index < input.length; index++)
			System.out.print(input[index] + " ");
		System.out.println();
		System.out.println("Maximum odd number from the array is: " + assignment14_Program4.getMaxOddNumber(input));
		System.out.println("Maximum even number from the array is: " + assignment14_Program4.getMaxEvenNumber(input));
		int diff = assignment14_Program4.getMaxOddNumber(input) - assignment14_Program4.getMaxEvenNumber(input);
		System.out.println("Difference between maximum odd and even numbers from the array is: " + Math.abs(diff));
	}
}