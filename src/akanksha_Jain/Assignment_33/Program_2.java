/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12] */

package akanksha_Jain.Assignment_33;

import java.util.Arrays;

public class Program_2 {
	
	void shiftNegativeNumAtBegin(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		int outputIndexCount = 0;
		for(int index=0; index<input.length; index++) {
			if(input[index]<0) {
				output[outputIndexCount] = input[index];
				count++;
				outputIndexCount++;
			}
		}
		int outputIndex = count;
		for(int index=0; index<input.length; index++) {
			if(input[index]>0) {
				output[outputIndex]=input[index];
				outputIndex++;
			}
		}
		System.out.println("Shift all negative numbers of array " + Arrays.toString(input) + " in the beginning");
		System.out.println("and positive numbers at the end");
		System.out.println("Output- " + Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int[] input = {1,-3,-2,11,44,55,-76,33,12};
		Program_2 program2 = new Program_2();
		program2.shiftNegativeNumAtBegin(input);
	}
}
