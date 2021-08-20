/* Assignment 16 : 16th Aug'2021

program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4  */

package arti_K.Assignment_16;

public class CountofTrees {
	
	void visibleTreecount(int[] treearr) {
		int count = 0;
		int height = 0;
		for(int index = 0; index < treearr.length; index++) {
			if(treearr[index] > height) {
				height = treearr[index];
				count++;
			}
		}
		System.out.println("Visible tree count is "+count);
	}
	
	public static void main(String[] args) {
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		CountofTrees count = new CountofTrees();
		count.visibleTreecount(treeHeights);
	}
}
