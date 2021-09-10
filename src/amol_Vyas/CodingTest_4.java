/*Test 4 : 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};*/

package amol_Vyas;

import java.util.Arrays;

public class CodingTest_4 {
	
	void getZeroAtLast(int[] input) {
		int[] output = new int[input.length];
		int nonZeroCount=0;
		int zeroCount=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]!=0) {
				output[nonZeroCount]=input[index];
				nonZeroCount++;
			} else {
				output[(output.length-1)-zeroCount]=input[index];
				zeroCount++;
			}
		}
	System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int[] input = {1,0,0,6,0,2,3,0,4,0,5};
		CodingTest_4 codingTest_4 = new CodingTest_4();
		codingTest_4.getZeroAtLast(input);
	}

}
