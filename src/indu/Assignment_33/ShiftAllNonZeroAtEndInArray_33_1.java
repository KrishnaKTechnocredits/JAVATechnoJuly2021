/*Program 1 : shift all non zeros at the end.
input : {1,0,3,4,0,2,88,0,0,22,34};
output : [0,0,0,0,1,3,4,2,88,22,34]*/
package indu.Assignment_33;

import java.util.Arrays;

public class ShiftAllNonZeroAtEndInArray_33_1 {

	void shiftNonZerosAtEnd(int[] arr)
	{
		int[] output = new int[arr.length];
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
				count++;
		}
		int outIndex=count;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0) {
				output[outIndex]=arr[i];
				outIndex++;
			}
		}
		System.out.println("Array with all nonZero numbers in the end of Array :\n"+Arrays.toString(output));
		
	}
	public static void main(String[] args) {
		ShiftAllNonZeroAtEndInArray_33_1 a33_1 = new ShiftAllNonZeroAtEndInArray_33_1();
		int [] input = {1,0,3,4,0,2,88,0,0,22,34};
		System.out.println("Input Array is:\n"+Arrays.toString(input));
		a33_1.shiftNonZerosAtEnd(input);
	}
}
