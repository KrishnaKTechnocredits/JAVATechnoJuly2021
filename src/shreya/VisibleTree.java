// Program to find out count of visible trees from given array
package shreya;

public class VisibleTree {
int visibleTreeCount(int[] num) {
	int count=1;
	int height=num[0];
	for(int index=0;index<num.length;index++) {
		if(num[index]>height) {
			height=num[index];
		    count++;
		}
	}return count;
}
	public static void main(String[] args) {
		int[] treeHeight={3,5,5,11,9,10,15,14};
		VisibleTree visibleTree=new VisibleTree();
		int visibleTreeCount=visibleTree.visibleTreeCount(treeHeight);
		System.out.println("Visible tree count is "+visibleTreeCount);
	}

}
