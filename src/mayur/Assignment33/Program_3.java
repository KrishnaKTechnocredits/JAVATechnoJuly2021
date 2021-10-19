/* program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12] */
package mayur.Assignment33;

import java.util.Arrays;

public class Program_3 {

	void shiftNegativeNumAtBeginZerosPostiveAtEnd(int[] input) {
		int[] output = new int[input.length];
		int count = 0, count2 = 0;
		int outputIndexCount = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index]<0) {
				output[outputIndexCount] = input[index];
				count++;
				outputIndexCount++;
			}
			if(input[index]==0) {
				count2++;
			}
		}
		int outputIndex = count + count2;
		for(int index=0; index<input.length; index++) {
			if(input[index]>0) {
				output[outputIndex]=input[index];
				outputIndex++;
			}
		}
		System.out.println("Shift all negative numbers of array " + Arrays.toString(input) + " in the beginning");
		System.out.println("then zeros and all positive numbers at the end");
		System.out.println("Output- " + Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		Program_3 program3 = new Program_3();
		program3.shiftNegativeNumAtBeginZerosPostiveAtEnd(input);
	}
}
