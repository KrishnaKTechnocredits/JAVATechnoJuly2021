package anuja;

public class Assignment_16 {
	int count;
	void displayHeight(int[] treeHeights) {
		for(int i=1;i<treeHeights.length;i++) {
			if(treeHeights[i-1]<treeHeights[i]) {
				count++;
			}
			else if((treeHeights[i-1]>treeHeights[i]) || (treeHeights[i]==treeHeights[i-1])) {
				continue;
			}
		}
		System.out.println("Count of visible trees is "+count);
	}	

	public static void main(String[] args) {
		Assignment_16 assignment_16=new Assignment_16();
		int[] treeHeights= {3,5,5,11,9,10,15,14};
		assignment_16.displayHeight(treeHeights);
	}
}
