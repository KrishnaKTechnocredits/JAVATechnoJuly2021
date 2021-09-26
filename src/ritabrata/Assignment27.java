/*Assignment - 27 : 2nd Sep'2021

 WAP to find 2 arrays are identical or not. 
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,55,32,17};
output : Identical
--------------------------------------------
int[] arr1 = {10,12,55,32,17,99};
int[] arr2 = {10,12,55,32,17};
output : Not identical
------------------------------------
int[] arr1 = {10,12,55,32,17};
int[] arr2 = {10,12,99,32,17};
output : Not Identical*/

package ritabrata;

import java.util.Arrays;

public class Assignment27 {
	void matchArray(int[] arr1, int[] arr2) {
				if(Arrays.equals(arr1, arr2)	) {
					System.out.println("The"+Arrays.toString(arr1)+" and "+Arrays.toString(arr2)+" are Identical");
				}
				else 
					System.out.println("The"+Arrays.toString(arr1)+" and "+Arrays.toString(arr2)+" are Not Identical");
	}

	public static void main(String[] args) {
		Assignment27 match= new Assignment27();
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17};
		match.matchArray(arr1, arr2);
		System.out.println("---------------------------------");
		int[] arr3 = {10,12,55,32,17,99};
		int[] arr4 = {10,12,55,32,17};
		match.matchArray(arr3, arr4);
		System.out.println("---------------------------------");
		int[] arr5 = {10,12,55,32,17};
		int[] arr6 = {10,12,99,32,17};
		match.matchArray(arr5, arr6);
	}

}
