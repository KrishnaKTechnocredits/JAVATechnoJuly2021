/*	Test 4 : Shift all Zero's at the end of the array. 
int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
ouput : {1,6,2,3,4,5,0,0,0,0,0};
 */

package arti_K.Aarti_Test_4;

import java.util.Arrays;

public class Test4 {

	void shiftZero(int[] arr){
		int count = 0;
		int[] output = new int[arr.length];
		
		for(int index = 0; index < arr.length; index++){
			if(arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
		}
		System.out.println("Array after shifting all Zero's at the end.");
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args){
		int[] arr = {1,0,0,6,0,2,3,0,4,0,5};
		System.out.println("Given Array : {1,0,0,6,0,2,3,0,4,0,5}\n");
		new Test4().shiftZero(arr);
	}

}
