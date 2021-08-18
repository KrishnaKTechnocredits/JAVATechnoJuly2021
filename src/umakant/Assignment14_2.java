package umakant;

public class Assignment14_2 {

	int getMinimum(int[] input) {
		int min = input[0];
		for (int index = 1; index < input.length; index++) {
			if (input[index] < min)
				min = input[index];
		}
		return min;
	}

	public static void main(String[] args) {
		Assignment14_2 assignment14_2 = new Assignment14_2();
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		System.out.print(assignment14_2.getMinimum(input));
	}

}
