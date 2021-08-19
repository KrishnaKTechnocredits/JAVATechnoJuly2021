package himanshu;

public class Assignment_14_Program2 {

	void maxNumber(int input[]) {
		int max = input[0];

		for (int i = 0; i < input.length; i++) {
			if (max < input[i]) {
				max = input[i];
			}
		}
		System.out.println("Maximum Number from given ARRAY is:" + max);
	}

	public static void main(String[] args) {

		int[] input = { 1, 11, 44, 23, 55, 99, 23 };

		Assignment_14_Program2 program2 = new Assignment_14_Program2();
		program2.maxNumber(input);
	}
}
