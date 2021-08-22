/*
 * Assignment 16 : 16th Aug'2021

program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4

 */

package mayur;

public class Assignment16 {

	void countOfVisibleTree(int[]arr) {
		int count=0;
		int max =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
				count++;
			}
		}System.out.println("Count of visible trees : "+count);
	}
	
	public static void main(String[]args) {
		Assignment16 assignment16 = new Assignment16();
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		assignment16.countOfVisibleTree(treeHeights);
	}
}
