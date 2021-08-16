package himanshu;

public class Assignment_13_Program2 {

	void zeroCountNumber(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 0) {
				System.out.println("Zero Number are: " + input[index]);
			}
		}
	}

	public static void main(String[] args) {

		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };

		Assignment_13_Program2 assignment_13 = new Assignment_13_Program2();
		assignment_13.zeroCountNumber(input);

	}

}