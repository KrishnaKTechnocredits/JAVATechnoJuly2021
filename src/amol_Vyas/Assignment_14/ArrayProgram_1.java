/*
program 1 : find maximum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 99
*/

package amol_Vyas.Assignment_14;

public class ArrayProgram_1 {

	int getMaximumNumberFromArray(int[] num ) {
		int max=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]>max)
				max=num[index];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		ArrayProgram_1 arrayProgram_1= new ArrayProgram_1();
		System.out.println("Maximum number from given array is "+arrayProgram_1.getMaximumNumberFromArray(input));
	}
}
