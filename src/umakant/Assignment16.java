package umakant;

public class Assignment16 {

	int getVisibleTreesCount(int[] input) {
		int previousMax = 0;
		int visibleTreesCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > previousMax) {
				previousMax = input[index];
				visibleTreesCount++;
			}
		}
		return visibleTreesCount;
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };
		System.out.print(assignment16.getVisibleTreesCount(treeHeights));
	}

}
