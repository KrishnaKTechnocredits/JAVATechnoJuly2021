package arti_G_Test4;

import java.util.Arrays;

/*Test 4 : 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};
We need to shift all zeros at the end of output array */
public class ShiftZero {

	int[] output(int[] arr) {
		int[] output = new int[arr.length];
		int index1=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=0) {
				output[index1] = arr[index];
				index1++;
			}
		}
		return output;
	}
	public static void main(String[] args) {
		ShiftZero shiftZero = new ShiftZero();
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		System.out.println("Output =" + Arrays.toString(shiftZero.output(arr)));
	}

}
