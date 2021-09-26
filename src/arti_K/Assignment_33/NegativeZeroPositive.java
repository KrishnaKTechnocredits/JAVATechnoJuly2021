/*	program 3: place all negative numbers at the beginning, zeros and all positive numbers at the end.
input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
output : [-3,-2,-76,0,0,0,1,11,44,55,33,12]
 */

package arti_K.Assignment_33;

import java.util.Arrays;

public class NegativeZeroPositive {

	void shiftNumbers(int[] arr){
		int[] numarr = new int[arr.length];
		int count = 0;
		
		for(int index = 0; index < arr.length; index++){
			if(arr[index] < 0){
				numarr[count] = arr[index];
				count++;
			}
		}
		
		for(int index = 0; index < arr.length; index++){
			if(arr[index] == 0)
			count++;
		}
		
		for(int index = 0; index < arr.length; index++){
			if(arr[index] > 0){
				numarr[count] = arr[index];
				count++;
			}
		}
		System.out.println("Array after shifting all negative numbers at the beginning, zeros and all positive numbers at the end.");
		System.out.println(Arrays.toString(numarr));
	}
	
	public static void main(String[] args){
		int[] input = {1,-3,0,-2,11,0,44,55,-76,33,0,12};
		System.out.println("Given Array : {1,-3,0,-2,11,0,44,55,-76,33,0,12}\n");
		new NegativeZeroPositive().shiftNumbers(input);
	}
}
