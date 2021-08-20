/*
program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3
*/

package amol_Vyas.Assignment_13;

public class ArrayProgram_1 {

	int getCountPositiveNumbers(int[] num ) {
		int count=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]>0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		ArrayProgram_1 arrayProgram_1= new ArrayProgram_1();
		System.out.println("Count of positive numbers from given array "+arrayProgram_1.getCountPositiveNumbers(input));
	}
}
