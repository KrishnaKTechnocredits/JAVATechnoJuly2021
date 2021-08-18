package nasir;

public class VisibleTree {

	int findCountOfVisibleTrees(int[] arr) {
		int count = 1;
		int height = arr[0];
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] > height) {
				height = arr[index];
				count++;
			}
		}
		return count;
	}
	
	void displayCountOfVisibleTrees(int[] arr) {
		System.out.println("Total visible trees are: "+findCountOfVisibleTrees(arr));
	}
	
	public static void main(String args[]) {
		VisibleTree visibleTree = new VisibleTree();
		int[] input = {3,5,5,11,9,10,15,14};
		visibleTree.displayCountOfVisibleTrees(input);
	}
}
