package varun_array_assignment;

public class Minimum_Number_From_Array_Assignment_14_1 {
	int min = 0;

	void minimumNumbe(int[] input) {
		min = input[0];
		for (int index = 0; index < input.length; index++) {
			if (min > input[index])
				min = input[index];
		}
		System.out.println("Minimum Number from the given array is "+min);
	}
	public static void main(String[] args) {
		Minimum_Number_From_Array_Assignment_14_1 assignment14_1 = new Minimum_Number_From_Array_Assignment_14_1();
		int[] input = {1,11,44,23,55,99,23};
		assignment14_1.minimumNumbe(input);
	}
}
