/*
 * Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};
 */
package swati.programmingTest;

import java.util.Arrays;

public class Test4 {
	
	void shifZeros(int[] input) {
		int startindex=0;
		int lastIndex=input.length-1;
		int[] output= new int[input.length];
		for(int index=0;index<input.length;index++) {
			if(input[index]==0) {
				output[lastIndex--]=input[index];
			}
			else
				output[startindex++]=input[index];
		}
		
		System.out.println(Arrays.toString(output));
	
	}

	public static void main(String[] a) {
		Test4 t1= new Test4();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		t1.shifZeros(arr);
	}
}
