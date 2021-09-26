package dattaraj;

public class Assignment_16 {
	int geVisibleTreeCnt(int[] input) {
		int counter = 1;
		int maxHeight = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxHeight) {
				maxHeight = input[index];
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Assignment_16 assignment_16 = new Assignment_16();
		int[] inputArray = { 3, 5, 5, 11, 9, 10, 15, 14 };

		System.out.println("Visible trees are : " + assignment_16.geVisibleTreeCnt(inputArray));
	}
}
