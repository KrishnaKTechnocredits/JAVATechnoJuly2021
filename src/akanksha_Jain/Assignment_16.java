/* Assignment 16 : 16th Aug'2021
program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4
Two assignments for today and another two for Monday.
Create a new branch for every assignment.
Create a separate class for every program.
Ex - For assignment 13 create one branch called yourName_Assignment_13
And push 3 java files of each program.
*/

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
