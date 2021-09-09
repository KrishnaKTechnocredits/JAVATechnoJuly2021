
/*
	 Test 4 : Shift all Zero's at the end of the array. 
	int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
	ouput : {1,6,2,3,4,5,0,0,0,0,0};


	*/
package sayli_Vyavhare;

import java.util.Arrays;

public class Test4 {

	int[] getShiftedarray(int[] arr) {
		int count = 0, innerindex = 0;
		int length = arr.length;
		int[] arr1 = new int[length];
		for (int index = 0; index < length; index++) {

			if (arr[index] != 0) {
				arr1[innerindex] = arr[index];
				innerindex++;
			} else {
				arr1[length - 1 - count] = arr[index];
				count++;
			}
		}
		return arr1;
	}

	public static void main(String[] args) {

		Test4 test = new Test4();
		int[] arr = { 1, 0, 0, 6, 0, 2, 3, 0, 4, 0, 5 };

		System.out.print("Shifted array is: " + Arrays.toString(test.getShiftedarray(arr)));
	}

}
