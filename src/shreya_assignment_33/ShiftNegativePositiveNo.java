/*Program 2: place all negative numbers at the beginning and all positive numbers at the end.
input = {1,-3,-2,11,44,55,-76,33,12};
output : [-3,-2,-76,1,11,44,55,33,12]*/
package shreya_assignment_33;

import java.util.Arrays;

public class ShiftNegativePositiveNo {
	int[] getNegativeAtbeginning(int[] input) {
		int count=0;
		int[] output=new int[input.length];
		
		for(int index=0;index<input.length;index++) {
			if(input[index]<0) {
				output[count]=input[index];
				count++;
			}
		}
		
		for(int index=0;index<input.length;index++) {
			if(input[index]>0) {
				output[count]=input[index];
				count++;
			}
		}
		
		System.out.println("Array after shifting negative no at beginning and positive no at end: "+Arrays.toString(output));
		return output;
	}
	public static void main(String[] args) {
		ShiftNegativePositiveNo shiftNegativePositiveNo=new ShiftNegativePositiveNo();
		int[] input= {1,-3,-2,11,44,55,-76,33,12};
		shiftNegativePositiveNo.getNegativeAtbeginning(input);

	}

}
