/*
program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3
*/
package sameer;

public class ArrayProgram1 {
	int getCountPositiveNumber(int[] num) {
		int count = 0;
		for (int index = 0; index <= num.length - 1; index++) {
			if (num[index] > 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = { 1, -11, -44, 23, 55, -99, -23, -22 };
		ArrayProgram1 arrayprogram1 = new ArrayProgram1();
		System.out.println("Return Count Of Positive Numbers From Given Array Is : "
				+ arrayprogram1.getCountPositiveNumber(input));
	}
}
