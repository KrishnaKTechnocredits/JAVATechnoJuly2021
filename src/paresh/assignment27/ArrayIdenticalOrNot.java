package paresh.assignment27;

import java.util.Arrays;

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
output : Not Identical

*/
public class ArrayIdenticalOrNot {

	String getArraysIdenticalOrNotMsg(int[] input1, int[] input2) {
		String msg = "";
		if (input1.length == input2.length) {
			for (int i = 0; i < input1.length; i++) {
				if (input1[i] == input2[i]) {
					msg = " is Identical";
				} else {
					msg = " is Not Identical";
					break;
				}
			}

		} else {
			msg = " is Not Identical";
		}
		return msg;
	}

	public static void main(String[] args) {
		ArrayIdenticalOrNot assignarrayidenticalornotment_27 = new ArrayIdenticalOrNot();
		int[] arr1 = { 10, 12, 55, 32, 17 };
		int[] arr2 = { 10, 12, 55, 32, 17 };
		int[] arr3 = { 10, 12, 55, 32, 17, 99 };
		int[] arr4 = { 10, 12, 99, 32, 17 };
		System.out.println("Given Arrays " + Arrays.toString(arr1) + " and " + Arrays.toString(arr2) 
				+ assignarrayidenticalornotment_27.getArraysIdenticalOrNotMsg(arr1, arr2));
		System.out.println("Given Arrays " + Arrays.toString(arr3) + " and " + Arrays.toString(arr2)
				+ assignarrayidenticalornotment_27.getArraysIdenticalOrNotMsg(arr3, arr2));
		System.out.println("Given Arrays " + Arrays.toString(arr1) + " and " + Arrays.toString(arr4)
				+ assignarrayidenticalornotment_27.getArraysIdenticalOrNotMsg(arr1, arr4));

	}

}