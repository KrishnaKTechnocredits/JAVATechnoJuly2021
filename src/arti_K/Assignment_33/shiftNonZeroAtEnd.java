/*	Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]
 */

package arti_K.Assignment_33;

import java.util.Arrays;

public class shiftNonZeroAtEnd {
	
	void shiftNonZeroNumber(int[] arr) {
		int zeroCount = 0;
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] == 0)
				zeroCount++;
		}
		
		int[] output = new int[arr.length];
		int outputIndex = zeroCount;
		
		for(int index = 0; index < arr.length; index++) {
			if(arr[index] > 0) {
				output[outputIndex] = arr[index];
				outputIndex++;
			}
		}
		System.out.println("Array after shifting all Non-Zero's value at the end.");
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		int[] input = {1,0,3,4,0,2,88,0,0,22,34};
		System.out.println("Given Array : {1,0,3,4,0,2,88,0,0,22,34}\n");
		new shiftNonZeroAtEnd().shiftNonZeroNumber(input);
	}

}
