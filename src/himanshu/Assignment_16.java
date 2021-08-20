package himanshu;

public class Assignment_16 {

	void visibleTress(int[] input) {

		int maxHeight = 0;
		int count = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxHeight) {
				count++;
				maxHeight = input[index];
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		int[] treeHeight = { 3, 5, 5, 11, 9, 10, 15, 14 };

		Assignment_16 assignment_16 = new Assignment_16();
		assignment_16.visibleTress(treeHeight);
	}
}
