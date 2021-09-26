package aniket;

public class TreeHeight {

	int visibleTree(int[] num) {
		int count = 0;
		for(int index = 0 ; index < num.length-1; index++) {
			if(num[index] < num[index+1])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		TreeHeight treeheight = new TreeHeight();
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		System.out.println("Visible trees count is: " + treeheight.visibleTree(treeHeights));
	}
}