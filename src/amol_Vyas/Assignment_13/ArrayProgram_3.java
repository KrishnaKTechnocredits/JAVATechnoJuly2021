/*
program 3 : write a method which returns 5 smaller numbers of the given number.
input : 50
output : 49, 48, 47, 46, 45
*/

package amol_Vyas.Assignment_13;

public class ArrayProgram_3 {

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
		ArrayProgram_3 arrayProgram_3 = new ArrayProgram_3();
		arrayProgram_3.getFiveSmallerNumbers(50);
	}

}
