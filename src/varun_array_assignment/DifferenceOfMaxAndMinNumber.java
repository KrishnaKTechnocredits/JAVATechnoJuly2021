package varun_array_assignment;

public class DifferenceOfMaxAndMinNumber {
	int max = 0;
	int min = 0;
	void maxNumber(int []input) {
		max = input[0];
		for(int index = 0;index<input.length;index++) {
			if(max<input[index])
				max = input[index];
		}
		System.out.println("Maximum number from the given array is " +max);
	}
	void minimumNumbe(int[] input) {
		min = input[0];
		for (int index = 0; index < input.length; index++) {
			if (min > input[index])
				min = input[index];
		}
		System.out.println("Minimum Number from the given array is "+min);
	}
	
	void difference() {
		int diff = max-min;
		System.out.println("Difference difference between max and min number from given array is " +diff);
	}
	public static void main(String[] args) {
		DifferenceOfMaxAndMinNumber differenceOfMaxAndMinNumber = new DifferenceOfMaxAndMinNumber();
		int[] input = {1,11,44,23,55,99,23};
		differenceOfMaxAndMinNumber.maxNumber(input);
		differenceOfMaxAndMinNumber.minimumNumbe(input);
		differenceOfMaxAndMinNumber.difference();
	}
}
