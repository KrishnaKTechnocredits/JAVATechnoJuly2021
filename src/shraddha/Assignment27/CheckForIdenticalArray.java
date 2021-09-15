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
output : Not Identical*/

package shraddha.Assignment27;

import java.util.Arrays;

public class CheckForIdenticalArray {
	public static void main(String[] args) {
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 19};
		CheckForIdenticalArray newObject = new CheckForIdenticalArray();
		System.out.println("First Array is :- "+Arrays.toString(arr1));
		System.out.println("Second Array is :- "+Arrays.toString(arr2));
		newObject.arrayComparision(arr1, arr2);
	}

	void arrayComparision(int[] array1, int[] array2) {
		boolean flag = false;
		if (array1.length != array2.length)
			System.out.println("Arrays not Identical !!");
		else {
			for (int index = 0; index < array1.length; index++) {
				if (array1[index] == array2[index])
					flag = true;
				else {
					flag = false;
					break;
				}
			}
		if(flag == true)
			System.out.println("Arrays Ideantical !!");
		else
			System.out.println("Arrays NOT Identical !!!");
		}
	}
}
