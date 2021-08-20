package husain;

public class Assignment_16 {

	int countOfTrees(int[] input) {
		int count = 1;
		int value = input[0];

		for (int index = 0; index < input.length + 1; index++) {
			if (index + 1 < input.length) {
				if (value < input[index + 1]) {
					value = input[index + 1];
					count++;
				}
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_16 obj = new Assignment_16();
		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };
		int treeCount = obj.countOfTrees(treeHeights);
		System.out.print("The given heights of trees are: ");
		for(int index = 0; index<treeHeights.length; index++)
			System.out.print(treeHeights[index]+ " ");
		System.out.println("\n\nThe count of visible trees is: "+treeCount);
	}

}
