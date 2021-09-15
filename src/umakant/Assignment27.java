/*
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
output : Not Identical
 */
package umakant;

public class Assignment27 {

	String checkIdenticalOrNot(int[] array1, int[] array2) {
		if (array1.length != array2.length)
			return "Not Identical";
		else {
			for (int index = 0; index < array1.length; index++) {
				if (array1[index] != array2[index])
					return "Not Identical";
			}
			return "Identical";
		}
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		System.out.println(assignment27.checkIdenticalOrNot(arr1, arr2));
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 55, 32, 17 };
		System.out.println(assignment27.checkIdenticalOrNot(arr3, arr4));
		int[] arr5 = { 10, 12, 55, 32, 17 };
		int[] arr6 = { 10, 12, 99, 32, 17 };
		System.out.println(assignment27.checkIdenticalOrNot(arr5, arr6));
	}
}
