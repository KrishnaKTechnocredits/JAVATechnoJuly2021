//Assignment 16;

package parthav;

public class ReturnCountOfVisibleTrees {

	int maxTreeHeight;
	int maxTreeCounter;

	int getCountOfVisibleTrees(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (maxTreeHeight < arr[index]) {
				maxTreeHeight = arr[index];
				maxTreeCounter++;
			}
		}
		return maxTreeCounter;
	}

	public static void main(String[] args) {
		ReturnCountOfVisibleTrees returnCount = new ReturnCountOfVisibleTrees();
		int[] inputArray = { 3, 5, 5, 11, 9, 10, 15, 14 };
		System.out.println("The count of visible trees are: " + returnCount.getCountOfVisibleTrees(inputArray));
	}

}
