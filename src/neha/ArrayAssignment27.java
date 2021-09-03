package neha;

import java.util.Arrays;

/*WAP to find 2 arrays are identical or not. 
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

public class ArrayAssignment27 {

	String findArraysIfIdenticalOrNot(int[] firstArr, int[] secondArr) {
		String output = "Not Identical";
		int arl1 = firstArr.length;
		int arl2 = secondArr.length;
		int matchCount = 0;
		if (arl1 == arl2) {
			for (int index = 0; index < arl1; index++) {
				if (firstArr[index] == secondArr[index])
					matchCount++;
			}
			if (matchCount == arl1)
				output = "Identical";
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayAssignment27 arrayAssignment27 = new ArrayAssignment27();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		System.out.println("Arrays " + Arrays.toString(arr1) + " and " + Arrays.toString(arr2) + " are: "
				+ arrayAssignment27.findArraysIfIdenticalOrNot(arr1, arr2));

		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		System.out.println("Arrays " + Arrays.toString(arr3) + " and " + Arrays.toString(arr4) + " are: "
				+ arrayAssignment27.findArraysIfIdenticalOrNot(arr3, arr4));

		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		System.out.println("Arrays " + Arrays.toString(arr5) + " and " + Arrays.toString(arr6) + " are: "
				+ arrayAssignment27.findArraysIfIdenticalOrNot(arr5, arr6));

	}

}
