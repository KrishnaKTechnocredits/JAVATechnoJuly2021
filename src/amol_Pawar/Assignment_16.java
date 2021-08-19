package amol_Pawar;

public class Assignment_16 {

	void getVisibleTree(int[] treeHeights) {
		int maxHeight = treeHeights[0];
		int count = 1;

		int arr[] = new int[treeHeights.length];
		for (int index = 0; index < treeHeights.length; index++) {
			if (maxHeight < treeHeights[index]) {
				maxHeight = treeHeights[index];
				count++;
			}
		}
		System.out.println("Total number of tree which can be visible are: " + count);
	}

	public static void main(String[] args) {
		Assignment_16 assignment_16 = new Assignment_16();
		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };
		assignment_16.getVisibleTree(treeHeights);
	}
}
/*Assignment 16 : 16th Aug'2021

program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4

Two assignments for today and another two for Monday.

Create a new branch for every assignment.
Create a separate class for every program.
*/