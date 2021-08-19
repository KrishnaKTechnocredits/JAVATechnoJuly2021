/* 
 Assignment 16 : 16th Aug'2021

program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4

Two assignments for today and another two for Monday.

Create a new branch for every assignment.
Create a separate class for every program.
Ex - For assignment 13 create one branch called yourName_Assignment_13
And push 3 java files of each program.

 */

package harshada;

public class Assignment_16 {
	
		int geVisibleTreeCount(int[] input) {
			int counter = 1;
			int maxHeight = input[0];
			for (int index = 0; index < input.length; index++) {
				if (input[index] > maxHeight) {
					maxHeight = input[index];
					counter++;
				}
			}
			return counter;
		}

		public static void main(String[] args) {
			Assignment_16 assignment_16 = new Assignment_16();
			int[] inputArray = { 3, 5, 5, 11, 9, 10, 15, 14 };
			
			System.out.println("Visible trees are = : " + assignment_16.geVisibleTreeCount(inputArray));
		}
}

