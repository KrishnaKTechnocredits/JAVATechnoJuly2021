package gauravk.Test_4;

import java.util.Arrays;

/*
 * Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};


Test 5 :
Find first 5 perfect numbers.

 */
public class ShiftingZerosToEndOfArray {
	
	int[] shiftingZerosToEnd(int[] arr1) {
		int[] result = new int[arr1.length];
		for(int i=0,j=0; i<arr1.length;i++) {
			if(arr1[i]!=0) {
				result[j]=arr1[i];
				j++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		System.out.println("The output is "+Arrays.toString(new ShiftingZerosToEndOfArray().shiftingZerosToEnd(arr)));
	}
}
