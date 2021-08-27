package poojaJoshi;

public class Assignment_13_3 {

	void smallNo(int number) {
		int[] input = new int[5];
		System.out.println("smaller numbers of given no 50 are- ");
		for (int index = 0; index < 5; index++) {
			number--;
			input[index] = number;
			System.out.println(input[index]);

		}

	}

	public static void main(String[] args) {
		Assignment_13_3 assignment_13_3 = new Assignment_13_3();
		assignment_13_3.smallNo(50);
	}
}