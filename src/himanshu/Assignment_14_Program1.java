package himanshu;

public class Assignment_14_Program1 {

	void minNumber(int input[]) {
		int min = input[0];
		for (int i = 0; i < input.length; i++) {
			if (min > input[i]) {
				min = input[i];
			}
		}
		System.out.println("Minimum Number from given ARRAY is:" + min);
	}

	public static void main(String[] args) {

		int[] input = { 1, 11, 44, 23, 55, 99, 23 };

		Assignment_14_Program1 program1 = new Assignment_14_Program1();
		program1.minNumber(input);
	}
}
