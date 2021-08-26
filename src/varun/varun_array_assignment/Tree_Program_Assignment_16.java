package varun.varun_array_assignment;

public class Tree_Program_Assignment_16 {
	int max = 0;
	int count =0;
	void countOfVisibleTree(int []arr) {
		for(int index = 0;index<arr.length;index++) {
			if(max<arr[index]) {
				max = arr[index]; //3//5//11//15
				count++; //1//2//3/4
			}
		}
		System.out.println("Total " +count+ " tress are visible from the given array string.");
	}
	public static void main(String[] args) {
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		Tree_Program_Assignment_16 assignment_16 = new Tree_Program_Assignment_16();
		assignment_16.countOfVisibleTree(treeHeights);
	}
}
