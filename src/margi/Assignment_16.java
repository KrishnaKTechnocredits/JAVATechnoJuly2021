package margi;

public class Assignment_16 {

	//count visible trees
	int cntVisibleTrees(int[] trees) {
		int count=1;
		int visible = trees[0];
		for(int index=0; index < trees.length; index++) {
			if(visible < trees[index]) {
				count++;
				visible = trees[index];
			}
		}
		return count;
	}
	
	void setData() {
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		System.out.println("Total Visible Trees are: " + cntVisibleTrees(treeHeights));
	}
	
	public static void main(String[] args) {
		Assignment_16 visibleTreesCnt = new Assignment_16();
		visibleTreesCnt.setData();
	}
}
