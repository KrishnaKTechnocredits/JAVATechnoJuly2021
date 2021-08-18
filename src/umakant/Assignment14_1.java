package umakant;

public class Assignment14_1 {

	int getMaximum(int[] input) {
		int max = input[0];
		for (int index = 1; index < input.length; index++) {
			if (input[index] > max)
				max = input[index];
		}
		return max;
	}

	public static void main(String[] args) {
		Assignment14_1 assignment14_1 = new Assignment14_1();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.print(assignment14_1.getMaximum(input));
	}

}
