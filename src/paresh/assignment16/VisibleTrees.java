package paresh.assignment16;

public class VisibleTrees {
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
		VisibleTrees visibleTrees = new VisibleTrees();
		int[] input = {3,5,5,11,9,10,15,14};
		visibleTrees.displayCountOfVisibleTrees(input);
	}
}



/*Assignment 16 : 16th Aug'2021

program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4*/