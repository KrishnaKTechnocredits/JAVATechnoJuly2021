/*
program 2 : find minimum number from given array.
int[] input = {1,11,44,23,55,99,23};
output : 11
 */

package amol_Vyas.Assignment_14;

public class ArrayProgram_2 {
	
	int getMinimumNumberFromArray(int[] num ) {
		int min=num[0];
		for(int index=0;index<num.length;index++) {
			if(num[index]<min)
				min=num[index];
		}
		return min;
	}

	public static void main(String[] args) {
		int[] input = {1,11,44,23,55,99,23};
		ArrayProgram_2 arrayProgram_2 = new ArrayProgram_2();
		System.out.println("Minimum number from given array is "+arrayProgram_2.getMinimumNumberFromArray(input));
	}
	
	
	
}
