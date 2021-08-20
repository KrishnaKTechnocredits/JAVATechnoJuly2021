/*
program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45
*/

package sameer;

public class ArrayProgram3 {
	int[] getFiveSmallerNumbers(int num) {
		int[] input = new int[5];
		int count = 0;
		for (int index = num; index > num - 5; num--) {
			if (count != 5) {
				input[count] = num - 1;
				System.out.println(input[count]);
				count++;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		ArrayProgram3 arrayprogram3 = new ArrayProgram3();
		arrayprogram3.getFiveSmallerNumbers(50);
	}

}
