package suruchi;

public class Assignment_16 {

	int getCountOfVisibleTrees(int[] arr) {
		int visibleTrees = 0;
		int maxTreeHeight = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > maxTreeHeight) {
				maxTreeHeight = arr[index];
				visibleTrees++;
			}
		}
		return visibleTrees;
	}

	public static void main(String[] args) {
		Assignment_16 assignment_16 = new Assignment_16();

		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };

		System.out.println("Trees with heights present in following order: ");
		for (int index = 0; index < treeHeights.length; index++)
			System.out.print(treeHeights[index] + " ");
		System.out.println();
		System.out.println("Total number of trees visible in a row based on their heights are: "
				+ assignment_16.getCountOfVisibleTrees(treeHeights));
	}
}
