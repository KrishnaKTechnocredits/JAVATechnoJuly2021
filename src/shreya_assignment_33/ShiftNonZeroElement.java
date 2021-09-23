/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]*/
package shreya_assignment_33;

import java.util.Arrays;

public class ShiftNonZeroElement {
	int[] getNonZeroAtEnd(int[] input) {
		int count=0;
		int[] output=new int[input.length];
		
		for(int index=0;index<input.length;index++) {
			if(input[index]==0) {
				count++;
			}
		}
		
		for(int index=0;index<input.length;index++) {
			if(input[index]!=0) {
				output[count]=input[index];
				count++;
			}
		}
		System.out.println("Array after shifting all non-zeros at end: "+Arrays.toString(output));
		return output;
	}
	public static void main(String[] args) {
		ShiftNonZeroElement shiftNonZeroElement = new ShiftNonZeroElement();
		int[] arr= {1,0,3,4,0,2,88,0,0,22,34};
		shiftNonZeroElement.getNonZeroAtEnd(arr);

	}

}
