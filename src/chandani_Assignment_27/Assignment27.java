/*Assignment - 27 : 2nd Sep'2021

 WAP to find 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17}};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17}};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17}};
output : Not Identical */

package chandani_Assignment_27;

import java.util.Arrays;

public class Assignment27{

		void getArrayIdentical(int[] input1, int[] input2){		
			if((input1.length) == (input2.length) && Arrays.equals(input1, input2)){
				System.out.println("Given arrays " + Arrays.toString(input1) + " and " + Arrays.toString(input2) + " are identical ") ;		 
			}else
				System.out.println("Given arrays " + Arrays.toString(input1) + " and " + Arrays.toString(input2) + " are not identical ");
		}
		
		public static void main(String[] args){
			Assignment27 assignment27 = new Assignment27();	
			int[] arr1 = {10,12,55,32,17};
			int[] arr2 = {10,12,55,32,17};
			assignment27.getArrayIdentical(arr1, arr2);
			int[] arr3 = {10,12,55,32,17,99};
			int[] arr4 = {10,12,55,32,17};
			assignment27.getArrayIdentical(arr3, arr4);
			int[] arr5 = {10,12,55,32,17};
			int[] arr6 = {10,12,99,32,17};
			assignment27.getArrayIdentical(arr5, arr6);	
		}	
}


