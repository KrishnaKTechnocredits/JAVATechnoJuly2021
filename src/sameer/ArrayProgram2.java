/*
program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};
output : 4
 */
package sameer;

public class ArrayProgram2 {
	int getCountZeroNumber(int[] num) {
		int count = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 1, -11, 0, 0, 55, 0, -23, 0 };
		ArrayProgram2 arrayProgram2 = new ArrayProgram2();
		System.out.println("Count Number Of Zero's In Given Array Is : " + arrayProgram2.getCountZeroNumber(input));
	}
}
