/*
program 2 : count number of zero's in given array.
int[] input = {1,-11,0,0,55,0,-23,0};
output : 4
 */

package amol_Vyas.Assignment_13;

public class ArrayProgram_2 {
	
	int getCountZeroNumber(int[] num) {
		int count=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]==0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] input = {1,-11,0,0,55,0,-23,0};
		ArrayProgram_2 arrayProgram_2 = new ArrayProgram_2();
		System.out.println("Count number of zero's in given array: "+arrayProgram_2.getCountZeroNumber(input));
	}
	
	
	
}
