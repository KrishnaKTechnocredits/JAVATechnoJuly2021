package madhavi;

public class Assignment_16 {
	int getVisibleTrees(int[] input) {
		int count = 0;
		int max = 0;
		for (int index = 0; index < input.length; index++) {
			if (max < input[index]) {
				max = input[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment_16 assignment_16 = new Assignment_16();
		System.out.println("Count of visible trees :");
		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };
		System.out.println(assignment_16.getVisibleTrees(treeHeights));
	}
}