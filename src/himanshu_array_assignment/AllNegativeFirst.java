package himanshu_array_assignment;

public class AllNegativeFirst {

	void allNegativeFirstMtd(int[] input) {

		int[] output = new int[input.length];

		int count = 0;

		for (int index = 0; index < output.length; index++) {
			if (input[index] < 0) {
				output[count] = input[index];
				count++;
			}
		}
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0) {
				output[count] = input[index];
				count++;
			}
			System.out.print(output[index] + ",");
		}

	}

	public static void main(String[] args) {

		int[] input = { 1, -3, -2, 11, 44, 55, -76, 33, 12 };

		AllNegativeFirst assignment33_2 = new AllNegativeFirst();
		assignment33_2.allNegativeFirstMtd(input);

	}

}
