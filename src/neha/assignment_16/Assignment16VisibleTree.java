package neha.assignment_16;

/*program 1 : From given array find out count of visible trees.
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4*/
public class Assignment16VisibleTree {
	int countVisibleTrees(int[] treeHt) {
		int count = 0;
		int maxTreeHt = 0;
		for (int index = 0; index < treeHt.length; index++) {
			if (treeHt[index] > maxTreeHt) {
				maxTreeHt = treeHt[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment16VisibleTree assignment16VisibleTree = new Assignment16VisibleTree();
		int[] treeHeights = { 3, 5, 5, 11, 9, 10, 15, 14 };
		System.out.println("Count of visible trees is " + assignment16VisibleTree.countVisibleTrees(treeHeights));

	}
}
