package arti_G;

/*Assignment 16 : 16th Aug'2021

program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4

Two assignments for today and another two for Monday.

Create a new branch for every assignment.
Create a separate class for every program.
Ex - For assignment 13 create one branch called yourName_Assignment_13
And push 3 java files of each program.*/
public class Assignment_16 {

	int treeHeight(int[] num) {
		int count = 0;
		int output = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] > output) {
				count++;
				output = num[index];
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment_16 assignment_16 = new Assignment_16();
		int[] num = { 3, 5, 5, 11, 9, 10, 15, 14 };
		System.out.println("Find out count of visible trees");
		System.out.println(assignment_16.treeHeight(num));
	}
}
