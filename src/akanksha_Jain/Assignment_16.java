package akanksha_Jain;

public class Assignment_16 {
	static int count, max=0;
	
	int getVisibleTreesCount(int[] treeHeights) {
		for(int index=0; index<treeHeights.length; index++) {
			if(treeHeights[index]>max) {
				max = treeHeights[index];
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		Assignment_16 assignment_16 = new Assignment_16();
		assignment_16.getVisibleTreesCount(treeHeights);
		System.out.println("The count of visible trees are " + count);
	}
}
