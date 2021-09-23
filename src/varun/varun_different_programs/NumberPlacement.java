package varun.varun_different_programs;

public class NumberPlacement {

	void placeNegativeNumberAtBeginingAndPositiveNumberAtLast(int[] arr) {
		int count = 0;
		int[] input = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < 0) {
				input[count] = arr[index];
				count++;
			}
		}

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				input[count] = arr[index];
				count++;
			}
		}
		System.out.println("Shifting all -ve number at first then zero and +ve number at the end ");
		for (int index = 0; index < input.length; index++) {
			System.out.print(input[index] + ",");
		}
		System.out.println();
	}

	void placeNegativeNumberAtBeginingThenZeroAndPositiveNumberAtLast(int []arr) {
		int count = 0;
		int [] value = new int[arr.length];
		for(int index=0;index<arr.length;index++) {
			if (arr[index] < 0) {
				value[count] = arr[index];
				count++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				value[count] = arr[index];
				count++;
			}
		}
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				value[count] = arr[index];
				count++;
			}
		}
		System.out.println("Shifting all -ve number at first then zero and +ve number at the end ");
		for (int index = 0; index < value.length; index++) {
			System.out.print(value[index] + ",");
		}
	}
	
	public static void main(String[] args) {
		int[] input = { 1,0, -3, -2, 11,0, 44, 55,0, -76, 33,12 };
		NumberPlacement numberPlacement = new NumberPlacement();
		numberPlacement.placeNegativeNumberAtBeginingAndPositiveNumberAtLast(input);
		numberPlacement.placeNegativeNumberAtBeginingThenZeroAndPositiveNumberAtLast(input);

	}
}
