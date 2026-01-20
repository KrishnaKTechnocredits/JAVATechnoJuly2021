/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34] */

package mayur.Assignment33;

import java.util.Arrays;

public class Program_1 {
	
	void shiftNonZerosAtEnd(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index]==0) {
				count++;
			}
		}
		int outputIndex = count;
		for(int index=0; index<input.length; index++) {
			if(input[index]!=0) {
				output[outputIndex]=input[index];
				outputIndex++;
			}
		}
		System.out.println("Shift all non zeros of array " + Arrays.toString(input) + " at the end");
		System.out.println("Output- " + Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		Program_1 program1 = new Program_1();
		program1.shiftNonZerosAtEnd(input);
	}
}
