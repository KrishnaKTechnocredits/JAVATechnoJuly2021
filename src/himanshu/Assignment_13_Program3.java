package himanshu;

public class Assignment_13_Program3 {

	void return5Numbers(int value) {
		int[] input = new int[5];
		for (int index = 0; index < 5; index++) {
			value--;
			input[index] = value;
			System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		Assignment_13_Program3 assignment_13 = new Assignment_13_Program3();
		assignment_13.return5Numbers(50);
	}

}
