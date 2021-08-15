package himanshu;

public class Assignment_13_Program1 {

	void positiveCount(int[] num) {
		for (int index = 0; index < num.length; index++) {
			if (num[index] >= 0) {
				System.out.println("Positive Nunber are: " + num[index]);
			}
		}
	}

	public static void main(String[] args) {

		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };

		Assignment_13_Program1 assignment_13 = new Assignment_13_Program1();
		assignment_13.positiveCount(input);

	}

}