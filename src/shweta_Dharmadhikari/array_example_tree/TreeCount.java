package shweta_Dharmadhikari.array_example_tree;

public class TreeCount {
	int getTreeCount(int[] input) {
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
		TreeCount treeCount = new TreeCount();
		int[] inputArray = { 3, 5, 5, 11, 9, 10, 15, 14 };
		System.out.println("The count of visible trees : " + treeCount.getTreeCount(inputArray));
	}
}
