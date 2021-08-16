/* program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11 */

package sameer;

public class ArrayProgram5 {
	int getMinNumberFromArray(int[] num) {
		int minNum = num[0];
		for (int index = 0; index < num.length; index++) {
			if (num[index] < minNum)
				minNum = num[index];
		}
		return minNum;
	}

	public static void main(String[] args) {
		int[] input = { 1, 11, 44, 23, 55, 99, 23 };
		ArrayProgram5 arrayprogram5 = new ArrayProgram5();
		System.out.println("Minimum Number From Given Array Is : " + arrayprogram5.getMinNumberFromArray(input));
	}

}
