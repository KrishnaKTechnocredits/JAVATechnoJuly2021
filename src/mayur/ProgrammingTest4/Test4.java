/*Test 4 : 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};
*/

package mayur.ProgrammingTest4;

import java.util.Arrays;

public class Test4 {
	
	void getZeroAtLastInArray(int[] input) {
		int[] output = new int[input.length];
		int numcount = 0;
		int zerocount = 0;
		for (int index=0;index<input.length;index++) {
			if(input[index]!=0) {
				output[numcount]=input[index];
				numcount++;
			}
			else {
				output[(output.length-1)-zerocount]=input[index];
				zerocount++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {1,0,0,6,0,2,3,0,4,0,5};
		
		Test4 test4 = new Test4();
		test4.getZeroAtLastInArray(input);
	}

}
