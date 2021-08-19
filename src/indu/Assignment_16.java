package indu;

import java.util.Arrays;

public class Assignment_16
{
	int countVisibleTrees(int[] trees) {

		int max = 0;
		int count = 0;
		for (int i = 0; i < trees.length ; i++) {
			if (trees[i] > max) {
				max = trees[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] arg)
	{
		Assignment_16 assignment_16= new Assignment_16();
		int[] treeHeights ={3,5,5,11,9,10,15,14,20,9,20,21};
		
		System.out.println("\nThe number of visible trees from given treeheighhts " 
		+ Arrays.toString(treeHeights) + " is : " + assignment_16.countVisibleTrees(treeHeights));
		
	}
}
