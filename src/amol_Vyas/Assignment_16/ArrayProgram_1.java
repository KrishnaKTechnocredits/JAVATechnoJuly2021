/*
program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4
*/
package amol_Vyas.Assignment_16;

public class ArrayProgram_1 {

	int getCountVisibleTree(int[] input) {
		int count = 0;
		int max = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > max) {
				max = input[index];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 5, 11, 9, 10, 15, 14 };
		ArrayProgram_1 arrayProgram_1 = new ArrayProgram_1();
		System.out.println("The visible count of tree is " + arrayProgram_1.getCountVisibleTree(input));
	}
}
