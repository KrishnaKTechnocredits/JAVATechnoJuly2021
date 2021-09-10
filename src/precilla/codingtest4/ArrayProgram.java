package precilla.codingtest4;

import java.util.Arrays;

public class ArrayProgram {
	
	public static void main(String[] args) {
		System.out.println("Test 4 : Shift all Zero's at the end of the array.");
		int[] arr= {1,0,0,6,0,2,3,0,4,0,5};
		System.out.println("Input:"+Arrays.toString(arr));
		ArrayProgram arrayProgram=new ArrayProgram();
		arrayProgram.getZeroAtLast(arr);
		
	}

	private int[] getZeroAtLast(int[] arr) {
		int output[] = new int[arr.length];
		int countIndex=0;
		for(int index=0;index<arr.length;index++) {
			if((arr[index])!=0) {
				output[countIndex]=arr[index];
				countIndex++;
			}

		}
		System.out.println("Output"+Arrays.toString(output));
	
	return output;
	}

}
